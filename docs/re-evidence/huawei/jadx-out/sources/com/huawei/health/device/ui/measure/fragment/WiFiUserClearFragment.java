package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.kit.hwwsp.hagrid.bean.MiniUserDataInfo;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.adapter.UserClearAdapter;
import com.huawei.health.device.wifi.interfaces.SelectClearUserInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import defpackage.dnj;
import defpackage.dow;
import defpackage.drw;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.ean;
import defpackage.eaq;
import defpackage.eby;
import defpackage.ece;
import defpackage.ecj;
import defpackage.lqo;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiUserClearFragment extends BaseFragment implements SelectClearUserInterface, HealthToolBar.OnSingleTapListener {
    private static final int CLEAR_USER_DATA_CHANGE_UI_SETVIEW = 1;
    private static final int CLEAR_USER_DATA_FAIL = 3;
    private static final int CLEAR_USER_DATA_SUCCESS = 0;
    private static final int CLEAR_USER_DATA_SUCCESS_FROM_WIFI = 2;
    private static final String DEVICE_MAIN_ID = "0";
    private static final int INSTEAD_FALSE = -1;
    private static final int MAX_USER_DATA = 10;
    private static final String TAG = "WiFiUserClearFragment";
    private static final int UID_MAX_LEN = 32;
    private static List<eaq> mUserList;
    private static UserClearAdapter sAdapter;
    private int mChooseCount;
    private Context mContext;
    private String mDeviceId;
    private HealthToolBar mHealthToolBar;
    private MyHandler mMyHandler;
    private String mProductId;
    private HealthRecycleView mRecyclerView;
    private int mNoSelect = -1;
    private ArrayList<MiniUserDataInfo> mUserDataInfoList = new ArrayList<>(10);
    private EventBus.ICallback mEventCallback = new EventBus.ICallback() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiUserClearFragment.1
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            String strE = dVar.e();
            Bundle bundleB = dVar.b();
            if (bundleB == null || !"delete_user_data_result".equals(strE)) {
                return;
            }
            if (bundleB.getInt("ret") == 0) {
                WiFiUserClearFragment.this.mMyHandler.sendEmptyMessage(0);
            } else {
                WiFiUserClearFragment.this.mMyHandler.obtainMessage(3).sendToTarget();
                LogUtil.e(WiFiUserClearFragment.TAG, "mEventCallback delete is fail");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteLocalData() {
        for (eaq eaqVar : sAdapter.a()) {
            dnj dnjVarD = eaqVar.d();
            if (dnjVarD != null) {
                ean.a(this.mDeviceId, dnjVarD.i());
            } else {
                LogUtil.j(TAG, "deleteLocalData delete user is null", eaqVar.c());
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dyg.a(false, TAG, "onCreate");
        this.mMyHandler = new MyHandler();
        this.mContext = dxw.d();
        if (getArguments() != null) {
            this.mDeviceId = getArguments().getString("deviceId");
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
            }
            try {
                this.mUserDataInfoList = getArguments().getParcelableArrayList("userData");
            } catch (Exception unused) {
                dyg.c(false, TAG, "getParcelableArrayList exception");
            }
        }
        EventBus.b(this.mEventCallback, 0, "delete_user_data_result");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.wifi_device_user_clear_layout, viewGroup, false);
        initView();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        initData();
        return viewGroup2;
    }

    private void initData() {
        mUserList = getUserClearBean();
        initAdpater();
    }

    private void initAdpater() {
        if (sAdapter == null) {
            sAdapter = new UserClearAdapter(mUserList, this.mContext, this, this.mProductId);
        }
        this.mRecyclerView.setAdapter(sAdapter);
    }

    private ArrayList<eaq> getUserClearBean() {
        ArrayList<eaq> arrayList = new ArrayList<>(16);
        List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        for (dnj dnjVar : allUser) {
            eaq eaqVar = new eaq();
            String strI = dnjVar.i();
            eaqVar.c(dnjVar);
            if (!dxm.ax(this.mProductId)) {
                setMiniUserClearBean(accountInfo, strI, eaqVar);
            } else {
                setUserClearBean(accountInfo, strI, eaqVar, dxm.ag(this.mProductId) ? 100 : 10);
            }
            addUserClearBean(eaqVar, arrayList);
        }
        return arrayList;
    }

    private void addUserClearBean(eaq eaqVar, ArrayList<eaq> arrayList) {
        if (eaqVar == null || eaqVar.e() <= 0.0d) {
            return;
        }
        arrayList.add(eaqVar);
    }

    private void setMiniUserClearBean(String str, String str2, eaq eaqVar) {
        String strSubstring;
        for (MiniUserDataInfo miniUserDataInfo : this.mUserDataInfoList) {
            String huid = miniUserDataInfo.getHuid();
            double weight = miniUserDataInfo.getWeight();
            if (!"0".equals(huid) && !ecj.d(str2, str)) {
                strSubstring = huid.substring(0, str2.length());
            } else {
                strSubstring = "";
            }
            if ((ecj.d(str2, str) && "0".equals(huid)) || str2.equals(strSubstring)) {
                if (weight > 0.0d) {
                    eaqVar.e(weight);
                    return;
                }
            } else {
                LogUtil.j(TAG, "setMiniUserClearBean User not found next data");
            }
        }
    }

    private void setUserClearBean(String str, String str2, eaq eaqVar, int i) {
        String strB;
        double d;
        if (ecj.d(str2, str)) {
            strB = ean.b(this.mDeviceId, String.valueOf(0));
        } else {
            strB = ean.b(this.mDeviceId, str2);
        }
        String strJ = ean.j(strB);
        if (strJ == null || TextUtils.isEmpty(strJ) || "0".equals(strJ)) {
            return;
        }
        try {
            d = Double.parseDouble(strJ);
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "userWeight parse double exception");
            d = 0.0d;
        }
        eaqVar.e(d / ((double) i));
    }

    private void initView() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "initView mainActivity is null");
            return;
        }
        setTitle(this.mainActivity.getString(R.string.IDS_device_wifi_clear_user));
        this.mCustomTitleBar.setLeftButtonDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.ic_public_select_cancel), qre.f(R.string.accessibility_close));
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.child.findViewById(R.id._clear_user_data_recycler_view);
        this.mRecyclerView = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.mContext));
        HealthToolBar healthToolBar = (HealthToolBar) this.child.findViewById(R.id.clear_user_data_health_tool_bar);
        this.mHealthToolBar = healthToolBar;
        healthToolBar.d(View.inflate(this.mainActivity, R.layout.hw_toolbar_bottomview, null));
        this.mHealthToolBar.setIcon(1, R.drawable.measure_weight_data_no_delete);
        this.mHealthToolBar.setIcon(3, R.drawable.ic_public_select_all);
        this.mHealthToolBar.setIconTitleColor(1, this.mainActivity.getResources().getString(R.string.IDS_contact_delete), R.color.textColorTertiary);
        this.mHealthToolBar.setIconTitle(3, this.mainActivity.getResources().getString(R.string.IDS_contact_delete_select_all));
        this.mHealthToolBar.setIconEnabled(1, false);
        this.mHealthToolBar.a(this.mainActivity);
        this.mHealthToolBar.setOnSingleTapListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setView() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "setView mainActivity is null");
            return;
        }
        Resources resources = this.mainActivity.getResources();
        int i = R.plurals.IDS_hw_weight_delete_check_measure_data;
        int i2 = this.mChooseCount;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        if (this.mChooseCount == 0) {
            setTitle(this.mainActivity.getString(R.string.IDS_device_wifi_selectNone));
            this.mHealthToolBar.setIcon(1, R.drawable.measure_weight_data_no_delete);
            this.mHealthToolBar.setIconEnabled(1, false);
            this.mHealthToolBar.setIconTitleColor(1, this.mainActivity.getResources().getString(R.string.IDS_contact_delete), R.color.textColorTertiary);
            if (mUserList.isEmpty()) {
                this.mHealthToolBar.setIconEnabled(3, false);
            } else {
                this.mHealthToolBar.setIconEnabled(3, true);
            }
        } else {
            setTitle(quantityString);
            this.mHealthToolBar.setIcon(1, R.drawable.measure_weight_data_delete);
            this.mHealthToolBar.setIconEnabled(1, true);
            this.mHealthToolBar.setIconTitleColor(1, this.mainActivity.getResources().getString(R.string.IDS_contact_delete), R.color.textColorPrimary);
        }
        if (this.mChooseCount == mUserList.size()) {
            this.mHealthToolBar.setIconTitle(3, this.mainActivity.getResources().getString(R.string.IDS_contact_delete_uncheck_all));
        } else {
            this.mHealthToolBar.setIconTitle(3, this.mainActivity.getResources().getString(R.string.IDS_contact_delete_select_all));
        }
        if (this.mNoSelect == 0) {
            dyg.a(false, TAG, "list is empty");
        }
    }

    @Override // com.huawei.health.device.wifi.interfaces.SelectClearUserInterface
    public void selectItem(int i, int i2) {
        this.mChooseCount = i2;
        this.mNoSelect = i;
        this.mMyHandler.sendEmptyMessage(1);
    }

    static class MyHandler extends StaticHandler<WiFiUserClearFragment> {
        private MyHandler(WiFiUserClearFragment wiFiUserClearFragment) {
            super(wiFiUserClearFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WiFiUserClearFragment wiFiUserClearFragment, Message message) {
            if (wiFiUserClearFragment.isDestroy()) {
                return;
            }
            if (!wiFiUserClearFragment.isAdded()) {
                dyg.c(false, WiFiUserClearFragment.TAG, "MyHandler mFragment is not add");
                return;
            }
            dyg.a(false, WiFiUserClearFragment.TAG, "MyHandler what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                wiFiUserClearFragment.deleteLocalData();
                wiFiUserClearFragment.clearDataSuccess();
            } else {
                if (i == 1) {
                    wiFiUserClearFragment.setView();
                    return;
                }
                if (i == 2) {
                    wiFiUserClearFragment.clearDataSuccess();
                } else if (i == 3) {
                    wiFiUserClearFragment.showDeleteFail();
                } else {
                    dyg.d(false, "MyHandler what is other", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataSuccess() {
        qpx.e(this.mainActivity, R.string.IDS_device_wifi_clear_user_success);
        mUserList = sAdapter.b();
        sAdapter.notifyDataSetChanged();
        if (njy.e(mUserList)) {
            onBackPressed();
        }
    }

    @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
    public void onSingleTap(int i) {
        if (i == 1) {
            showDeleteConfirmDialog();
            return;
        }
        if (i == 3) {
            if (this.mChooseCount == mUserList.size()) {
                sAdapter.d();
                return;
            } else {
                sAdapter.e();
                return;
            }
        }
        LogUtil.j(TAG, "onSingleTap default");
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.a(this.mEventCallback, "delete_user_data_result");
        List<eaq> list = mUserList;
        if (list != null) {
            list.clear();
            mUserList = null;
        }
        if (sAdapter != null) {
            sAdapter = null;
        }
        ArrayList<MiniUserDataInfo> arrayList = this.mUserDataInfoList;
        if (arrayList != null) {
            arrayList.clear();
            this.mUserDataInfoList = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        dyg.c(false, TAG, "DeviceMainActivity is Destroyed");
        return true;
    }

    private void deleteChooseUserInfo() {
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.e(TAG, "ProductId is null");
            return;
        }
        if (!dxm.ax(this.mProductId)) {
            deleteMiniUser();
            return;
        }
        Context context = BaseApplication.getContext();
        if (!ecj.b(context)) {
            qpx.e(context, R.string.IDS_device_wifi_not_network);
            return;
        }
        UserClearAdapter userClearAdapter = sAdapter;
        if (userClearAdapter == null) {
            LogUtil.j(TAG, "deleteChooseUserInfo sAdapter is null");
        } else {
            clearSingleUserInfo(userClearAdapter.a());
        }
    }

    private void deleteMiniUser() {
        dow dowVar = new dow();
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        UserClearAdapter userClearAdapter = sAdapter;
        if (userClearAdapter == null) {
            LogUtil.j(TAG, "deleteMiniUser sAdapter is null");
            return;
        }
        Iterator<eaq> it = userClearAdapter.a().iterator();
        while (it.hasNext()) {
            String strI2 = it.next().d().i();
            if (strI != null && strI.equals(strI2)) {
                byte[] bArrC = dowVar.c(strI2);
                byte[] bArr = new byte[bArrC.length + 32];
                System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
                Bundle bundle = new Bundle();
                bundle.putByteArray(JsbMapKeyNames.H5_USER_ID, bArr);
                EventBus.a(new EventBus.d("delete_user_data", bundle));
            } else {
                byte[] bArrC2 = dowVar.c(strI);
                byte[] bArrE = dowVar.e(strI2);
                byte[] bArr2 = new byte[bArrC2.length + bArrE.length];
                System.arraycopy(bArrC2, 0, bArr2, 0, bArrC2.length);
                System.arraycopy(bArrE, 0, bArr2, bArrC2.length, bArrE.length);
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray(JsbMapKeyNames.H5_USER_ID, bArr2);
                EventBus.a(new EventBus.d("delete_user_data", bundle2));
            }
        }
    }

    private void getClearUserInfo(dnj dnjVar, eby ebyVar, List<DeviceServiceInfo> list) {
        String strG;
        String strValueOf;
        if (dnjVar == null) {
            dyg.d(false, TAG, "getClearUserInfo user is null");
            return;
        }
        if (dnjVar.h().equals(MultiUsersManager.INSTANCE.getMainUser().h())) {
            strValueOf = String.valueOf(0);
            strG = ece.f32732a;
        } else {
            String strI = dnjVar.i();
            strG = dnjVar.g();
            strValueOf = strI;
        }
        if (ebyVar.a().m() != 2) {
            if (strG.indexOf("_") >= 0) {
                strG = strG.substring(0, strG.indexOf("_"));
            }
        } else if (strG.indexOf("_") == -1) {
            strG = strG + "_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        }
        HashMap map = new HashMap(16);
        map.put("id", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        map.put("uid", strValueOf);
        map.put("isClear", String.valueOf(1));
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid(strG);
        dyg.a(false, TAG, "getClearUserInfo serviceInfo:", deviceServiceInfo);
        list.add(deviceServiceInfo);
    }

    private void clearSingleUserInfo(final ArrayList<eaq> arrayList) {
        if (TextUtils.isEmpty(this.mDeviceId)) {
            dyg.d(false, TAG, "getClearUserInfo deviceId is null");
            return;
        }
        HealthDevice healthDeviceC = drw.e().c(this.mDeviceId);
        if (healthDeviceC == null || !(healthDeviceC instanceof eby)) {
            dyg.d(false, TAG, "getClearUserInfo device is null or type error");
            return;
        }
        eby ebyVar = (eby) healthDeviceC;
        ArrayList arrayList2 = new ArrayList(16);
        Iterator<eaq> it = arrayList.iterator();
        while (it.hasNext()) {
            getClearUserInfo(it.next().d(), ebyVar, arrayList2);
        }
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        wifiDeviceControlDataModelReq.setDevId(this.mDeviceId);
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList2);
        lqo.b(this.mContext).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiUserClearFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m944xff46a62f(arrayList, (CloudCommonReponse) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$clearSingleUserInfo$0$com-huawei-health-device-ui-measure-fragment-WiFiUserClearFragment, reason: not valid java name */
    /* synthetic */ void m944xff46a62f(ArrayList arrayList, CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        if (z) {
            dyg.a(false, TAG, "clearSingleUserInfo clear userInfo success");
            this.mMyHandler.obtainMessage(2).sendToTarget();
            updataDataByWifiDeviceStatus(arrayList);
        } else {
            dyg.d(false, TAG, "clearSingleUserInfo clear userInfo fail");
            this.mMyHandler.obtainMessage(3).sendToTarget();
        }
    }

    private void updataDataByWifiDeviceStatus(final ArrayList<eaq> arrayList) {
        WifiDeviceGetDeviceStatusReq wifiDeviceGetDeviceStatusReq = new WifiDeviceGetDeviceStatusReq();
        wifiDeviceGetDeviceStatusReq.setDevId(this.mDeviceId);
        lqo.b(this.mContext).c(wifiDeviceGetDeviceStatusReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiUserClearFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m946x23d7267f(arrayList, (WifiDeviceGetDeviceStatusRsp) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updataDataByWifiDeviceStatus$1$com-huawei-health-device-ui-measure-fragment-WiFiUserClearFragment, reason: not valid java name */
    /* synthetic */ void m946x23d7267f(ArrayList arrayList, WifiDeviceGetDeviceStatusRsp wifiDeviceGetDeviceStatusRsp, String str, boolean z) {
        if (wifiDeviceGetDeviceStatusRsp == null) {
            LogUtil.j(TAG, "updataDataByWifiDeviceStatus response is null");
            return;
        }
        if (TextUtils.isEmpty(wifiDeviceGetDeviceStatusRsp.getStatus()) || !wifiDeviceGetDeviceStatusRsp.getStatus().equals(CustomTabsCallback.ONLINE_EXTRAS_KEY)) {
            LogUtil.j(TAG, "updataDataByWifiDeviceStatus device is offline");
            return;
        }
        LogUtil.a(TAG, "updataDataByWifiDeviceStatus device is online, get device response:", wifiDeviceGetDeviceStatusRsp.toString(), ",success:", Boolean.valueOf(z));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ean.a(this.mDeviceId, ((eaq) it.next()).d().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDeleteFail() {
        qpx.e(this.mainActivity, R.string.IDS_device_wifi_delete_fail);
    }

    private void showDeleteConfirmDialog() {
        dyg.a(false, TAG, "showDeleteConfirmDialog");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.mainActivity);
        builder.b(R.string.IDS_device_wifi_userinfo_delete_confirm).a(R.string.IDS_bolt_wheel_set_cancel, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiUserClearFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a(WiFiUserClearFragment.TAG, "showDeleteConfirmDialog NegativeButton");
            }
        }).c(R.string.IDS_bolt_wheel_set_confirm, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiUserClearFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m945xa702f53a(view);
            }
        });
        builder.c().show();
    }

    /* JADX INFO: renamed from: lambda$showDeleteConfirmDialog$3$com-huawei-health-device-ui-measure-fragment-WiFiUserClearFragment, reason: not valid java name */
    /* synthetic */ void m945xa702f53a(View view) {
        deleteChooseUserInfo();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (dxm.ag(this.mProductId)) {
            popupFragment(HagridDeviceManagerFragment.class);
            return false;
        }
        popupFragment(WiFiProductIntroductionFragment.class);
        SharedPreferenceManager.e(this.mainActivity, String.valueOf(10000), "health_is_wificlear", "true", null);
        return false;
    }
}
