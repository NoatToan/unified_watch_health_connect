package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.adapter.ProductListAdapter;
import com.huawei.health.ecologydevice.ui.measure.adapter.WeightListAdapter;
import com.huawei.health.ecologydevice.ui.measure.fragment.ListFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.dru;
import defpackage.dxc;
import defpackage.dxw;
import defpackage.elh;
import defpackage.elj;
import defpackage.elk;
import defpackage.etn;
import defpackage.lmf;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceSelectBindFragment extends ListFragment {
    private static final String AM16_PRODUCTID = "6d5416d9-2167-41df-ab10-c492e152b44f";
    private static final String AUTO_TEST_PRODUCT_ID = "aa:bb:cc:dd";
    private static final String HONOR_DEVICE = "honor";
    private static final String HUAWEI_DEVICE = "huawei";
    private static final String METIS_PRODUCTID = "9323f6b7-b459-44f4-a698-988d1769832a";
    private static final String TAG = "DeviceSelectBindFragment";
    private static final int TO_FAILED = 2;
    private static final int TO_REFRESH = 1;
    private HealthDevice.HealthDeviceKind mKind;
    private ProductListAdapter mProductListAdapter;
    private WeightListAdapter mWeightListAdapter;
    protected ArrayList<elh> mProductInfos = new ArrayList<>(10);
    private ArrayList<elh> mHuawei = new ArrayList<>(10);
    private ArrayList<elh> mHonor = new ArrayList<>(10);
    private ArrayList<elh> mOther = new ArrayList<>(10);
    private boolean mIsDownDevice = false;
    private ArrayList<String> mToDownloadList = new ArrayList<>(10);
    private boolean isBackToFinish = false;
    private AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment.1
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            DeviceSelectBindFragment deviceSelectBindFragment = DeviceSelectBindFragment.this;
            deviceSelectBindFragment.handleClickEvent(i, deviceSelectBindFragment.mProductListAdapter);
        }
    };
    private Runnable mAdapterData = new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment.2
        @Override // java.lang.Runnable
        public void run() {
            DeviceSelectBindFragment deviceSelectBindFragment = DeviceSelectBindFragment.this;
            deviceSelectBindFragment.initAdapterData(deviceSelectBindFragment.mKind);
        }
    };
    private Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j(DeviceSelectBindFragment.TAG, "DeviceSelectBindFragment mHandler handleMessage:msg == null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                DeviceSelectBindFragment.this.refreshData(message);
            } else {
                if (i != 2) {
                    return;
                }
                LogUtil.a(DeviceSelectBindFragment.TAG, "DeviceSelectBindFragment FAILED");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshData(Message message) {
        LogUtil.a(TAG, "DeviceSelectBindFragment REFRESH");
        elh elhVar = message.obj instanceof elh ? (elh) message.obj : null;
        if (elhVar == null || !this.mKind.equals(elhVar.m())) {
            return;
        }
        if (METIS_PRODUCTID.equals(elhVar.t()) || AM16_PRODUCTID.equals(elhVar.t()) || !((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isShowWiFiDevice(elhVar.t())) {
            LogUtil.a(TAG, "DeviceSelectBindFragment productInfo = ", elhVar);
            return;
        }
        if (this.mKind == HealthDevice.HealthDeviceKind.HDK_WEIGHT) {
            String strC = elhVar.l().c();
            LogUtil.a(TAG, "DeviceSelectBindFragment company = ", strC);
            sort(this.mProductInfos, elhVar, strC);
            try {
                this.mWeightListAdapter.notifyDataSetChanged();
                return;
            } catch (IllegalStateException e) {
                LogUtil.j(TAG, "DeviceSelectBindFragment mHandler TO_REFRESH HDK_WEIGHT isMain = ", Boolean.valueOf(Looper.myLooper() == Looper.getMainLooper()), ", e:", e.getMessage());
                return;
            }
        }
        this.mProductListAdapter.a(elhVar);
        try {
            this.mProductListAdapter.notifyDataSetChanged();
        } catch (IllegalStateException e2) {
            LogUtil.j(TAG, "DeviceSelectBindFragment mHandler TO_REFRESH HDK_WEIGHT isMain = ", Boolean.valueOf(Looper.myLooper() == Looper.getMainLooper()), ", e:", e2.getMessage());
        }
    }

    private void sort(ArrayList<elh> arrayList, elh elhVar, String str) {
        if (getActivity() == null) {
            LogUtil.j(TAG, "sort getActivity() == null");
        } else if (arrayList.isEmpty()) {
            addHeaderItem(arrayList, elhVar, str);
        } else {
            productInfosSort(arrayList);
            queryWhetherRepeation(arrayList, elhVar, str);
        }
    }

    private void queryWhetherRepeation(ArrayList<elh> arrayList, elh elhVar, String str) {
        int iQuery = query(arrayList, elhVar);
        if (HUAWEI_DEVICE.equalsIgnoreCase(str)) {
            if (this.mHuawei.size() <= 0) {
                elh elhVar2 = new elh(1);
                elhVar2.g(getActivity().getString(R.string.IDS_device_huawei_band));
                elhVar2.c(true);
                arrayList.add(0, elhVar2);
                elhVar.e(false);
            }
            if (iQuery == -1) {
                arrayList.add(1, elhVar);
                return;
            } else {
                arrayList.set(iQuery, elhVar);
                return;
            }
        }
        if (HONOR_DEVICE.equalsIgnoreCase(str)) {
            if (this.mHonor.size() <= 0) {
                elh elhVar3 = new elh(1);
                elhVar3.g(getActivity().getString(R.string.IDS_device_honor_band));
                elhVar3.c(false);
                if (this.mHuawei.size() <= 0) {
                    arrayList.add(this.mHuawei.size(), elhVar3);
                } else {
                    arrayList.add(this.mHuawei.size() + 1, elhVar3);
                }
                elhVar.e(false);
            }
            if (iQuery == -1) {
                if (this.mHuawei.size() <= 0) {
                    arrayList.add(this.mHuawei.size() + 1, elhVar);
                    return;
                } else {
                    arrayList.add(this.mHuawei.size() + 2, elhVar);
                    return;
                }
            }
            arrayList.set(iQuery, elhVar);
            return;
        }
        if (this.mOther.size() <= 0) {
            elh elhVar4 = new elh(1);
            elhVar4.g(getActivity().getString(R.string.IDS_user_profile_more));
            elhVar4.c(false);
            arrayList.add(arrayList.size(), elhVar4);
        }
        if (iQuery == -1) {
            arrayList.add(arrayList.size(), elhVar);
        } else {
            arrayList.set(iQuery, elhVar);
        }
    }

    private void addHeaderItem(ArrayList<elh> arrayList, elh elhVar, String str) {
        elh elhVar2 = new elh(1);
        if (HUAWEI_DEVICE.equalsIgnoreCase(str)) {
            elhVar2.g(getActivity().getString(R.string.IDS_device_huawei_band));
            elhVar2.c(true);
            elhVar.e(false);
        } else if (HONOR_DEVICE.equalsIgnoreCase(str)) {
            elhVar2.g(getActivity().getString(R.string.IDS_device_honor_band));
            elhVar2.c(false);
            elhVar.e(false);
        } else {
            elhVar2.g(getActivity().getString(R.string.IDS_user_profile_more));
            elhVar2.c(false);
        }
        arrayList.add(elhVar2);
        arrayList.add(elhVar);
    }

    private void productInfosSort(ArrayList<elh> arrayList) {
        this.mHuawei.clear();
        this.mHonor.clear();
        this.mOther.clear();
        for (elh elhVar : arrayList) {
            elh.d dVarL = elhVar.l();
            if (dVarL != null) {
                String strC = dVarL.c();
                if (strC != null) {
                    if (strC.equalsIgnoreCase(HUAWEI_DEVICE)) {
                        this.mHuawei.add(elhVar);
                    } else if (strC.equalsIgnoreCase(HONOR_DEVICE)) {
                        this.mHonor.add(elhVar);
                    } else {
                        LogUtil.a(TAG, "DeviceSelectBindFragment productInfosSort");
                    }
                } else {
                    this.mOther.add(elhVar);
                }
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ListFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ListFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "DeviceSelectBindFragment onCreateView");
        ResourceManager.c().e(new MyResourceFileListener(this));
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        init();
        return viewOnCreateView;
    }

    private void init() {
        LogUtil.a(TAG, "DevcieSelectBindFragment-init");
        String string = getArguments().getString("kind");
        this.isBackToFinish = getArguments().getBoolean(DeviceCategoryFragment.WIFI_UPDATE_BACK_FINISH, false);
        this.mKind = etn.a(string);
        LogUtil.a(TAG, "DevcieSelectBindFragment-------" + string);
        showMoreButton(false, null);
        this.mProductInfos.clear();
        this.myDevicesListview = (ListView) this.child.findViewById(R.id.device_list_view);
        initView(this.mKind);
        if (this.mKind == HealthDevice.HealthDeviceKind.HDK_WEIGHT) {
            this.mWeightListAdapter = new WeightListAdapter(this.mainActivity, this.mProductInfos);
            this.myDevicesListview.setAdapter((ListAdapter) this.mWeightListAdapter);
            this.myDevicesListview.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment$$ExternalSyntheticLambda0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    this.f$0.m1068x718c388e(adapterView, view, i, j);
                }
            });
        } else {
            this.mProductListAdapter = new ProductListAdapter(this.mProductInfos);
            this.myDevicesListview.setAdapter((ListAdapter) this.mProductListAdapter);
            this.myDevicesListview.setOnItemClickListener(this.mOnItemClickListener);
        }
        String string2 = getArguments().getString("deviceType");
        if (string2 != null) {
            super.setTitle(string2);
        }
        super.showButton(false, null);
    }

    /* JADX INFO: renamed from: lambda$init$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceSelectBindFragment, reason: not valid java name */
    /* synthetic */ void m1068x718c388e(AdapterView adapterView, View view, int i, long j) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SELECT_DEVICE_2060002.value(), map, 0);
        elh item = this.mWeightListAdapter.getItem(i);
        if (item == null || item.l() == null) {
            return;
        }
        switchProductIntroductionFragment(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAdapterData(HealthDevice.HealthDeviceKind healthDeviceKind) {
        elk elkVarE = ResourceManager.c().b().e(healthDeviceKind);
        this.mToDownloadList.clear();
        if (elkVarE == null) {
            LogUtil.j(TAG, "the productGroup is null");
        } else {
            LogUtil.a(TAG, "home size=", Integer.valueOf(elkVarE.b().size()), " more size=" + elkVarE.a().size());
            for (elj eljVar : elkVarE.b()) {
                if (ResourceManager.c().h(dxc.d + eljVar.a()) && ResourceManager.c().c(eljVar.a())) {
                    elh elhVarD = ResourceManager.c().d(eljVar.a());
                    if (elhVarD != null) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        messageObtain.obj = elhVarD;
                        this.mHandler.sendMessage(messageObtain);
                    }
                } else {
                    this.mToDownloadList.add(eljVar.c());
                    LogUtil.j(TAG, "DeviceSelectBindFragment file is not Exists ", eljVar.c());
                }
            }
        }
        if (!ResourceManager.c().e() && !ResourceManager.c().a()) {
            LogUtil.a(TAG, "DeviceSelectBindFragment toDownloadList ", Integer.valueOf(this.mToDownloadList.size()));
            if (this.mToDownloadList.size() <= 0 || this.mIsDownDevice) {
                return;
            }
            ResourceManager.c().b(this.mToDownloadList);
            return;
        }
        ResourceManager.c().i();
    }

    public void initView(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a(TAG, "DeviceSelectBindFragment initView");
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
            showMoreButton(true, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    HashMap map = new HashMap(16);
                    map.put("click", "1");
                    lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_MORE_DEVICE_SEARCH_2060017.value(), map, 0);
                    if (BluetoothAdapter.getDefaultAdapter().getState() == 12) {
                        DeviceSelectBindFragment.this.switchDeviceScanningFragment();
                        return;
                    }
                    NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(DeviceSelectBindFragment.this.getActivity());
                    builder.b(R.string.IDS_device_bluetooth_open_request);
                    builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment.4.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            DeviceSelectBindFragment.this.switchDeviceScanningFragment();
                        }
                    });
                    builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment.4.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
                    noTitleCustomAlertDialogC.setCancelable(false);
                    noTitleCustomAlertDialogC.show();
                }
            });
        }
        this.mIsDownDevice = false;
        dxw.c(this.mAdapterData);
        LogUtil.a(TAG, "DeviceSelectBindFragment initview finished");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchDeviceScanningFragment() {
        setTitle(getResources().getString(R.string.IDS_device_search_title));
        Bundle bundle = new Bundle();
        bundle.putString("productId", AUTO_TEST_PRODUCT_ID);
        bundle.putString("scan_kind", HealthDevice.HealthDeviceKind.HDK_HEART_RATE.name());
        bundle.putString("title", getResources().getString(R.string.IDS_device_search_title));
        Fragment deviceScanningFragment = new DeviceScanningFragment();
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", "");
        contentValues.put("productId", AUTO_TEST_PRODUCT_ID);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        deviceScanningFragment.setArguments(bundle);
        switchFragment(deviceScanningFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ResourceManager.c().f();
    }

    static class MyResourceFileListener implements ResourceFileListener {
        WeakReference<DeviceSelectBindFragment> weakReference;

        MyResourceFileListener(DeviceSelectBindFragment deviceSelectBindFragment) {
            this.weakReference = new WeakReference<>(deviceSelectBindFragment);
        }

        @Override // com.huawei.health.device.manager.ResourceFileListener
        public void onResult(int i, String str) {
            DeviceSelectBindFragment deviceSelectBindFragment = this.weakReference.get();
            if (deviceSelectBindFragment != null) {
                if (i == 200) {
                    if (MessageConstant.GROUP_MEDAL_TYPE.equals(str)) {
                        deviceSelectBindFragment.mIsDownDevice = true;
                        dxw.c(deviceSelectBindFragment.mAdapterData);
                        return;
                    } else {
                        elh elhVarD = ResourceManager.c().d(str);
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        messageObtain.obj = elhVarD;
                        deviceSelectBindFragment.mHandler.sendMessage(messageObtain);
                    }
                }
                if (i == -1) {
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 2;
                    messageObtain2.obj = str;
                    deviceSelectBindFragment.mHandler.sendMessage(messageObtain2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClickEvent(int i, ProductListAdapter productListAdapter) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SELECT_DEVICE_2060002.value(), map, 0);
        dru druVar = productListAdapter.getItem(i) instanceof dru ? (dru) productListAdapter.getItem(i) : null;
        if (druVar == null || druVar.e() != 0) {
            return;
        }
        elh elhVar = druVar.i() instanceof elh ? (elh) druVar.i() : null;
        if (elhVar != null) {
            switchProductIntroductionFragment(elhVar);
        }
    }

    private void switchProductIntroductionFragment(elh elhVar) {
        Fragment productIntroductionFragment = new ProductIntroductionFragment();
        if (((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).isWiFiDevice(elhVar.t())) {
            productIntroductionFragment = ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).getPluginDeviceFragment(WeightConstants.FragmentType.WIFI_PRODUCT_INTRODUCTION);
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", elhVar.t());
        productIntroductionFragment.setArguments(bundle);
        switchFragment(productIntroductionFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (this.isBackToFinish) {
            this.mainActivity.finish();
            return false;
        }
        return super.onBackPressed();
    }
}
