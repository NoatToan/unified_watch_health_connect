package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity;
import com.huawei.ui.main.stories.health.interactors.healthdata.SelectUserInterface;
import defpackage.dnj;
import defpackage.eau;
import defpackage.eav;
import defpackage.ecj;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ClaimMeasureDataFragment extends BaseFragment {
    public static final String CLAIM_DATA_FINISH_RESULT = "claimresult";
    public static final String CLAIM_DATA_FINISH_USER_ID = "claimUserId";
    public static final String CLAIM_DATA_FINISH_USER_NAME = "claimusername";
    private static final int RESISTANCE_DIVIDER = 10;
    private static final String TAG = "ClaimMeasureDataFragment";
    protected FragmentActivity mActivity;
    protected ClaimMeasureDataActivity.c mClaimHandler;
    private CommonDialog21 mLoadingDialog;
    protected SelectUserInterface mSelectUserInterface;

    public abstract void claimMeasureData();

    public abstract void deleteWeightData();

    public abstract int getListSize();

    public abstract void removeItem();

    public abstract void sendStartClaimWeightData();

    public abstract void setAllChooseItem(boolean z);

    public abstract void setList();

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mActivity = getActivity();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            setAllChooseItem(false);
        }
    }

    public void setUserInterfaceAndHandler(SelectUserInterface selectUserInterface, ClaimMeasureDataActivity.c cVar) {
        this.mSelectUserInterface = selectUserInterface;
        this.mClaimHandler = cVar;
    }

    public void sendClaimWeight() {
        if (isConnectNetWork()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            messageObtain.arg1 = 0;
            this.mClaimHandler.sendMessage(messageObtain);
            sendStartClaimWeightData();
        }
    }

    public boolean saveWeightData() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            return true;
        }
        LogUtil.j(TAG, "saveWeightData : Network is not Connected!");
        qpx.b(this.mActivity, R.string.IDS_confirm_network_whether_connected);
        return false;
    }

    protected void saveSingleUserWeightData(final dnj dnjVar, ArrayList<eau> arrayList) {
        if (dnjVar == null || njy.e(arrayList)) {
            LogUtil.j(TAG, "saveSingleUserWeightData currentUser is null or selectedDatas is empty");
            return;
        }
        String strI = MultiUsersManager.INSTANCE.getCurrentUser().i();
        String strI2 = dnjVar.i();
        final boolean zEquals = TextUtils.equals(strI2, MultiUsersManager.INSTANCE.getMainUser().i());
        final boolean z = !TextUtils.equals(strI, strI2);
        LogUtil.a(TAG, "currentUser has been changed ? isCurrentUserChanged = ", Boolean.valueOf(z), ", currentUserIsMain = ", Boolean.valueOf(zEquals));
        this.mClaimHandler.removeMessages(6);
        ClaimWeightDataManager.INSTANCE.claimWeightData(arrayList, dnjVar, LoginInit.getInstance(this.mActivity).getAccountInfo(1011), new WeightInsertStatusCallback() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment.3
            @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
            public void isSuccess(boolean z2) {
                ReleaseLogUtil.d(ClaimMeasureDataFragment.TAG, "claim weight data isSuccess ", Boolean.valueOf(z2));
                if (z2) {
                    ClaimMeasureDataFragment.this.mClaimHandler.sendEmptyMessageDelayed(6, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
                    ClaimWeightDataManager.INSTANCE.startSync();
                    if (z) {
                        LogUtil.a(ClaimMeasureDataFragment.TAG, "refresh the BaseHealthDataActivity");
                        ClaimWeightDataManager.INSTANCE.onCurrentUserChanged(zEquals);
                    }
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                Bundle bundle = new Bundle();
                bundle.putBoolean(ClaimMeasureDataFragment.CLAIM_DATA_FINISH_RESULT, z2);
                bundle.putString(ClaimMeasureDataFragment.CLAIM_DATA_FINISH_USER_NAME, dnjVar.h());
                bundle.putString(ClaimMeasureDataFragment.CLAIM_DATA_FINISH_USER_ID, dnjVar.i());
                messageObtain.setData(bundle);
                ClaimMeasureDataFragment.this.mClaimHandler.sendMessage(messageObtain);
            }
        });
    }

    protected void deleteSelectedWeightData(ArrayList<eau> arrayList) {
        ClaimWeightDataManager.INSTANCE.deleteWeightData(arrayList, this.mActivity, new HiDataOperateListener() { // from class: com.huawei.ui.main.stories.health.fragment.ClaimMeasureDataFragment.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    ClaimMeasureDataFragment.this.mClaimHandler.sendEmptyMessage(3);
                    LogUtil.a(ClaimMeasureDataFragment.TAG, "deleteCheckData ErrorConstants.SUCCESS");
                } else {
                    LogUtil.j(ClaimMeasureDataFragment.TAG, "deleteCheckData ErrorConstants.ERR_NONE");
                }
            }
        });
    }

    protected void saveConflictUserInfo(eau eauVar, eav eavVar) {
        LogUtil.a(TAG, "saveConflictUserInfo userInfo to dataBean");
        HiHealthData hiHealthDataA = eauVar.a();
        hiHealthDataA.putDouble(BleConstants.BODY_FAT_RATE, eavVar.b() / 10.0d);
        hiHealthDataA.putDouble(IndoorEquipManagerApi.KEY_HEART_RATE, eavVar.g());
        hiHealthDataA.putDouble("age", eavVar.c());
        hiHealthDataA.putInt("height", eavVar.d());
        hiHealthDataA.putInt(CommonConstant.KEY_GENDER, eavVar.a());
        hiHealthDataA.putDouble("lfrfHfImpedance", eavVar.f() / 10.0d);
        hiHealthDataA.putDouble("lhrhHfImpedance", eavVar.m() / 10.0d);
        hiHealthDataA.putDouble("lhlfHfImpedance", eavVar.i() / 10.0d);
        hiHealthDataA.putDouble("lhrfHfImpedance", eavVar.l() / 10.0d);
        hiHealthDataA.putDouble("rhlfHfImpedance", eavVar.p() / 10.0d);
        hiHealthDataA.putDouble("rhrfHfImpedance", eavVar.q() / 10.0d);
        hiHealthDataA.putDouble("lfrfImpedance", eavVar.j() / 10.0d);
        hiHealthDataA.putDouble("lhrhImpedance", eavVar.n() / 10.0d);
        hiHealthDataA.putDouble("lhlfImpedance", eavVar.h() / 10.0d);
        hiHealthDataA.putDouble("lhrfImpedance", eavVar.o() / 10.0d);
        hiHealthDataA.putDouble("rhlfImpedance", eavVar.k() / 10.0d);
        hiHealthDataA.putDouble("rhrfImpedance", eavVar.t() / 10.0d);
    }

    protected boolean isConnectNetWork() {
        Context context = BaseApplication.getContext();
        if (ecj.b(context)) {
            return true;
        }
        qpx.e(context, R.string.IDS_device_wifi_not_network);
        return false;
    }

    public void claimFinishAndChangeUi(boolean z, String str) {
        destroyLoadingDialog();
    }

    public void showDialog() {
        if (this.mLoadingDialog == null) {
            new CommonDialog21(this.mActivity, R.style.app_update_dialogActivity);
            this.mLoadingDialog = CommonDialog21.b(this.mActivity);
        }
        this.mLoadingDialog.setCancelable(false);
        this.mLoadingDialog.b(getString(R.string.IDS_hw_weight_claim_data_claiming));
        this.mLoadingDialog.c();
    }

    public void destroyLoadingDialog() {
        CommonDialog21 commonDialog21 = this.mLoadingDialog;
        if (commonDialog21 == null || !commonDialog21.isShowing() || this.mActivity.isFinishing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
        this.mLoadingDialog = null;
    }
}
