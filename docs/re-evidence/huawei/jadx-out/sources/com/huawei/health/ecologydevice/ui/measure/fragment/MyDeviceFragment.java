package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.CommonLibUtilApi;
import com.huawei.health.device.api.DataBaseapiApi;
import com.huawei.health.device.api.DeviceFragmentFactoryApi;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.DeviceStateConstants;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindingFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSilentGuideFragment;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmz;
import defpackage.dru;
import defpackage.dsa;
import defpackage.dxw;
import defpackage.dxy;
import defpackage.ecu;
import defpackage.ekd;
import defpackage.elg;
import defpackage.elh;
import defpackage.elk;
import defpackage.elo;
import defpackage.etn;
import defpackage.ioi;
import defpackage.iov;
import defpackage.ltc;
import defpackage.pic;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MyDeviceFragment extends ListFragment {
    private static final int BLUETOOTH_SWITCH = 1;
    private static final String CLICK_BUTTON_NO = "cancelEnableBluetooth";
    private static final String KIND = "kind";
    private static final int MSG_BATTERY = 4;
    private static final int MSG_CONNECTED = 0;
    private static final int MSG_CONNECTING = 3;
    private static final int MSG_DISCONNECTED = 2;
    private static final int MSG_TIME_OUT = 1;
    private static final int MSG_UNAVAILABLE = 5;
    private static final String PRODUCT_ID = "productId";
    private static final int SHOW_BINDED = 0;
    private static final int SHOW_UNIQUE_LENGTH = 3;
    private static final String TAG = "MyDeviceFragment";
    private static final String VIEW = "view";
    private static WeakReference<MyDeviceFragment> sFragment;
    private Context mContext;
    private DeviceInfoUtilsApi mDeviceInfoUtilsApi;
    private HealthDeviceEntryApi mHealthDeviceEntryApi;
    private HonourDeviceConstantsApi mHonourDeviceConstantsApi;
    private boolean mIsShowWiFiDevice;
    private ArrayList<String> mNotHeartRateDeviceList;
    private OnItemReconnectListener mOnItemReconnectListener;
    private ProductListAdapter mProductAdapter;
    private String mReconnectDevice;
    private VersionMgrApi mVersionMgrApi;
    private static final BroadcastReceiver DEVICE_BATTERY_RECEIVER = new BroadcastReceiver() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo currentDevice;
            if (!"com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction()) || intent.getExtras() == null || (currentDevice = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getCurrentDevice()) == null || currentDevice.getDeviceConnectState() != 2) {
                return;
            }
            MyDeviceFragment.sHandler.sendEmptyMessage(4);
        }
    };
    private static Handler sHandler = new Handler() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            MyDeviceFragment myDeviceFragment = MyDeviceFragment.sFragment != null ? (MyDeviceFragment) MyDeviceFragment.sFragment.get() : null;
            if (myDeviceFragment == null) {
                LogUtil.a(MyDeviceFragment.TAG, "MyDeviceFragment is null");
                return;
            }
            if (!myDeviceFragment.isAdded()) {
                LogUtil.a(MyDeviceFragment.TAG, "MyDeviceFragment current fragment not attached activity!");
                return;
            }
            int i = message.what;
            if (i == 0 || i == 1) {
                MyDeviceFragment.connectedOrTimeOut(message, myDeviceFragment);
                return;
            }
            if (i == 2) {
                MyDeviceFragment.updateAdapterList(message, myDeviceFragment);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                    myDeviceFragment.showBandUnavailableDialog(myDeviceFragment.mContext);
                    return;
                } else {
                    myDeviceFragment.initList(myDeviceFragment.mKind);
                    myDeviceFragment.showEmpty();
                    myDeviceFragment.mProductAdapter.notifyDataSetChanged();
                    return;
                }
            }
            LogUtil.a(MyDeviceFragment.TAG, "msg_connect_change state: " + myDeviceFragment.mProductAdapter.isConnecting + " msg: " + message.what);
            myDeviceFragment.mReconnectDevice = (String) message.obj;
            myDeviceFragment.mProductAdapter.setConnecting(true);
            myDeviceFragment.initList(myDeviceFragment.mKind);
            myDeviceFragment.mProductAdapter.notifyDataSetChanged();
        }
    };
    private static final BroadcastReceiver NON_LOCAL_BROAD_CASTRECEIVER = new BroadcastReceiver() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a(MyDeviceFragment.TAG, "mNonLocalBroadcastReceiver()  intent : " + intent.getAction());
            try {
                DeviceInfo deviceInfo = intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo ? (DeviceInfo) intent.getParcelableExtra("deviceinfo") : null;
                if (deviceInfo != null && MyDeviceFragment.sHandler != null) {
                    Message messageObtainMessage = MyDeviceFragment.sHandler.obtainMessage();
                    messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
                    if (deviceInfo.getDeviceConnectState() == 2) {
                        LogUtil.a(MyDeviceFragment.TAG, "mNonLocalBroadcastReceiver() DEVICE_CONNECTED");
                        messageObtainMessage.what = 0;
                        MyDeviceFragment.sHandler.sendMessage(messageObtainMessage);
                        return;
                    }
                    if (deviceInfo.getDeviceConnectState() != 3 && deviceInfo.getDeviceConnectState() != 4) {
                        if (deviceInfo.getDeviceConnectState() == 1) {
                            LogUtil.a(MyDeviceFragment.TAG, "mNonLocalBroadcastReceiver() DEVICE_CONNECTING");
                            messageObtainMessage.what = 3;
                            MyDeviceFragment.sHandler.sendMessage(messageObtainMessage);
                            return;
                        } else if (deviceInfo.getDeviceConnectState() == 5) {
                            messageObtainMessage.what = 5;
                            MyDeviceFragment.sHandler.sendMessage(messageObtainMessage);
                            return;
                        } else {
                            LogUtil.a(MyDeviceFragment.TAG, "mNonLocalBroadcastReceiver() onReceive other");
                            return;
                        }
                    }
                    LogUtil.a(MyDeviceFragment.TAG, "mNonLocalBroadcastReceiver() DEVICE_DISCONNECTED");
                    messageObtainMessage.what = 2;
                    MyDeviceFragment.sHandler.sendMessage(messageObtainMessage);
                    ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).setBattery(-1);
                    return;
                }
                LogUtil.a(MyDeviceFragment.TAG, "mNonLocalBroadcastReceiver() deviceInfo = null");
            } catch (ClassCastException e) {
                LogUtil.a(MyDeviceFragment.TAG, "DeviceInfo deviceInfo error :" + e.getMessage());
            }
        }
    };
    private static int sReconnectCount = 0;
    private CustomViewDialog mCustomViewDialog = null;
    private ArrayList<elh> mProductInfoList = new ArrayList<>(10);
    private ArrayList<dru> mProductList = new ArrayList<>(10);
    private ArrayList<dru> mDeviceGroupInfoList = new ArrayList<>(10);
    private String mEntryType = "";
    private ArrayList<ContentValues> mListCompare = new ArrayList<>(10);
    private ArrayList<dxy> mWearInfoList = new ArrayList<>(10);
    private HealthDevice.HealthDeviceKind mKind = HealthDevice.HealthDeviceKind.HDK_UNKNOWN;
    private NoTitleCustomAlertDialog mCloseBtDialog = null;
    private boolean isFromFitnessAdvice = false;
    private int mLvMarginBottomForToolBar = 100;
    private CustomTextAlertDialog mDialog = null;
    private Handler mBindHandler = new Handler() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a(MyDeviceFragment.TAG, "MyDeviceFragment bindHandler handleMessage:msg == null");
                return;
            }
            super.handleMessage(message);
            if (message.what != 0) {
                return;
            }
            elh elhVarD = message.obj instanceof String ? ResourceManager.c().d((String) message.obj) : null;
            if (elhVarD != null) {
                for (ContentValues contentValues : MyDeviceFragment.this.mListCompare) {
                    if (contentValues.getAsString("productId").equals(elhVarD.t())) {
                        dru druVar = new dru();
                        druVar.a(contentValues);
                        druVar.d(0);
                        druVar.c(elhVarD);
                        MyDeviceFragment.this.mProductList.add(druVar);
                        MyDeviceFragment.this.mProductAdapter.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
    };

    public interface OnItemReconnectListener {
        void onItemClick(int i);

        void onReconnect(dxy dxyVar);
    }

    static /* synthetic */ void lambda$entryTypeEqualsList$5(View view) {
    }

    static /* synthetic */ void lambda$showBandUnavailableDialog$7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void connectedOrTimeOut(Message message, MyDeviceFragment myDeviceFragment) {
        LogUtil.a(TAG, "reconnect device timeout ？" + message.what);
        myDeviceFragment.initList(myDeviceFragment.mKind);
        String str = (String) message.obj;
        if (message.what == 1) {
            sHandler.removeMessages(1);
            myDeviceFragment.mProductAdapter.stopLoading();
            myDeviceFragment.mProductAdapter.setConnecting(false);
        } else if (!TextUtils.isEmpty(str) && str.equals(myDeviceFragment.mReconnectDevice)) {
            sHandler.removeMessages(1);
            myDeviceFragment.mProductAdapter.stopLoading();
            myDeviceFragment.mProductAdapter.setConnecting(false);
            myDeviceFragment.mReconnectDevice = null;
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).sendDeraultSwitch();
        } else {
            LogUtil.a(TAG, "connectedOrTimeOut other");
        }
        myDeviceFragment.initList(myDeviceFragment.mKind);
        myDeviceFragment.mProductAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateAdapterList(Message message, MyDeviceFragment myDeviceFragment) {
        String str = message.obj instanceof String ? (String) message.obj : null;
        if (!TextUtils.isEmpty(str) && str.equals(myDeviceFragment.mReconnectDevice)) {
            LogUtil.d(TAG, "stop loading...");
            sHandler.removeMessages(1);
            myDeviceFragment.mProductAdapter.stopLoading();
            myDeviceFragment.mProductAdapter.setConnecting(false);
            myDeviceFragment.mReconnectDevice = null;
        }
        LogUtil.d(TAG, "fragment.mReconnectDevice : " + myDeviceFragment.mReconnectDevice + " isConnecting: " + myDeviceFragment.mProductAdapter.getConnecting());
        myDeviceFragment.initList(myDeviceFragment.mKind);
        myDeviceFragment.mProductAdapter.notifyDataSetChanged();
    }

    public static void setFragment(WeakReference<MyDeviceFragment> weakReference) {
        sFragment = weakReference;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ListFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "MyDeviceFragment onCreateView");
        setFragment(new WeakReference(this));
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ResourceManager.c().e(new BindResourceFileListener());
        this.mVersionMgrApi = (VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class);
        this.mDeviceInfoUtilsApi = (DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class);
        this.mHealthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        this.mHonourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
        init();
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEmpty() {
        LinearLayout linearLayout = (LinearLayout) this.child.findViewById(R.id.hw_no_bonded_device_layout);
        if (this.mProductList.isEmpty() && this.mListCompare.isEmpty()) {
            linearLayout.setVisibility(0);
            int height = getActivity().getWindowManager().getDefaultDisplay().getHeight();
            float f = Resources.getSystem().getDisplayMetrics().density;
            LogUtil.d(TAG, "MyDeviceFragment heightInDp is " + ((height / f) + 0.5f));
            if (linearLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.topMargin = (int) ((((double) height) / 3.0d) - (((double) f) * 72.5d));
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.mContext = activity;
        if (activity == null) {
            LogUtil.d(TAG, "onActivityCreated mContext== null");
        }
    }

    private void init() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getString("root_in_me") != null) {
            string = arguments.getString("root_in_me");
        } else {
            string = "";
        }
        if (arguments != null && arguments.getString(KIND) != null) {
            this.mKind = etn.a(arguments.getString(KIND));
            LogUtil.a(TAG, "====the kind is " + this.mKind.name());
        }
        if (arguments != null) {
            this.isFromFitnessAdvice = arguments.getBoolean("isFromFitnessAdvice", false);
            try {
                this.mNotHeartRateDeviceList = arguments.getStringArrayList("notHeartRateDeviceList");
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e(TAG, "onCreateView init ArrayIndexOutOfBoundsException");
            }
        }
        if (CommonUtil.ck()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            BroadcastManagerUtil.c(BaseApplication.getContext(), NON_LOCAL_BROAD_CASTRECEIVER, intentFilter, LocalBroadcast.f36595c, null);
            registerBatteryBroadcast();
        }
        initList(this.mKind);
        this.mProductAdapter = new ProductListAdapter(this.mProductList);
        if (arguments != null && arguments.getString("EntryType") != null) {
            String string2 = arguments.getString("EntryType");
            this.mEntryType = string2;
            this.mIsShowWiFiDevice = "WiFiDevice".equals(string2);
        }
        this.myDevicesListview = (ListView) this.child.findViewById(R.id.device_list_view);
        if (this.myDevicesListview.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.myDevicesListview.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, this.mLvMarginBottomForToolBar);
            this.myDevicesListview.setLayoutParams(layoutParams);
        }
        this.myDevicesListview.setAdapter((ListAdapter) this.mProductAdapter);
        clickAdapterItem(string);
    }

    private void clickAdapterItem(final String str) {
        this.mProductAdapter.setOnItemReconnectListener(new OnItemReconnectListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.5
            @Override // com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.OnItemReconnectListener
            public void onReconnect(dxy dxyVar) {
                MyDeviceFragment.this.connectStatus(dxyVar);
            }

            @Override // com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.OnItemReconnectListener
            public void onItemClick(int i) {
                MyDeviceFragment.this.clickItemPosition(i);
            }
        });
        if ("List".equals(this.mEntryType)) {
            setTitle(getResources().getString(R.string.IDS_device_show_operate_my_device));
            showEmpty();
            showMoreButton(true, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m989xab00a490(str, view);
                }
            });
            setAddButton(str);
        } else {
            elk elkVarE = ResourceManager.c().b().e(this.mKind);
            if (elkVarE != null) {
                setTitle(getResources().getString(R.string.IDS_device_show_device_string, getResources().getString(elo.d(elkVarE.c()))));
                showButton(false, null);
                showMoreButton(false, null);
            }
        }
        showButton(false, null);
        LogUtil.a(TAG, "MyDeviceFragment init finished");
    }

    /* JADX INFO: renamed from: lambda$clickAdapterItem$0$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment, reason: not valid java name */
    /* synthetic */ void m989xab00a490(String str, View view) {
        if ("me".equals(str)) {
            switchFragment(new DeviceBindingFragment(), str);
        } else {
            switchFragment(new DeviceBindingFragment());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clickItemPosition(int i) {
        if (i >= this.mProductList.size()) {
            LogUtil.a(TAG, "onItemClick position >= productInfoList.size()");
            return;
        }
        dru druVar = this.mProductList.get(i);
        boolean z = this.mProductAdapter.isConnecting;
        LogUtil.a(TAG, "onItemClick deviceGroupInfo.getDeviceType() " + druVar.e());
        if (druVar.e() == 0) {
            LogUtil.a(TAG, "onItemClick sanfang");
            if (z && this.mReconnectDevice != null) {
                LogUtil.d(TAG, "other device is connecting.");
                return;
            }
            elh elhVar = (elh) druVar.i();
            if (elhVar != null) {
                LogUtil.a(TAG, "productInfo != null And position = " + i + "productId = " + elhVar.t());
                if ("List".equals(this.mEntryType) || "WiFiDevice".equals(this.mEntryType)) {
                    LogUtil.a(TAG, "EntryType == List");
                    entryTypeEqualsList(i, elhVar, druVar);
                    return;
                } else if ("Measure".equals(this.mEntryType)) {
                    LogUtil.a(TAG, "EntryType == Measure");
                    useWifiDeviceMeasure(elhVar);
                    entryTypeEqualsMeasure(druVar);
                    return;
                } else if ("Pick".equals(this.mEntryType)) {
                    LogUtil.a(TAG, "EntryType == Pick");
                    entryTypeEqualsPick(elhVar);
                    return;
                } else {
                    LogUtil.a(TAG, "clickItemPosition third");
                    return;
                }
            }
            return;
        }
        if (druVar.e() == 1) {
            smartWearer(druVar, z);
        } else {
            LogUtil.a(TAG, "clickItemPosition other device");
        }
    }

    private void useWifiDeviceMeasure(elh elhVar) {
        if (!this.mHonourDeviceConstantsApi.isWiFiDevice(elhVar.t()) || CommonUtil.ab(this.mContext)) {
            return;
        }
        ((CommonLibUtilApi) Services.b("PluginDevice", CommonLibUtilApi.class)).showWiFiEnableDialog(this.mContext);
    }

    private void smartWearer(dru druVar, boolean z) {
        LogUtil.a(TAG, "onItemClick wear");
        dxy dxyVar = (dxy) druVar.i();
        String str = this.mReconnectDevice;
        boolean z2 = false;
        boolean z3 = (str == null || str.equals(dxyVar.d())) ? false : true;
        if (z && dxyVar.b() != 2) {
            z2 = true;
        }
        if (z3 && z2) {
            LogUtil.d(TAG, "other devices is connection,can not start activity.");
            return;
        }
        if (dxyVar.b() == 2) {
            openWearHome(dxyVar.d());
            return;
        }
        if (this.mDeviceInfoUtilsApi.getWearInfo().size() == 1) {
            openWearHome(dxyVar.d());
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.mContext, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        intent.putExtra("device_name", dxyVar.i());
        intent.putExtra("device_identify", dxyVar.d());
        intent.putExtra("device_picID", dxyVar.o());
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, dxyVar.g());
        iov.d(this.mContext, intent);
        LogUtil.d(TAG, "onclick wear not connected name:" + dxyVar.i() + "identify:" + dxyVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectStatus(dxy dxyVar) {
        LogUtil.a(TAG, "user choose connect");
        List<DeviceInfo> wearDeviceList = this.mDeviceInfoUtilsApi.getWearDeviceList();
        if (wearDeviceList == null) {
            LogUtil.a(TAG, "mDeviceInfoList is null");
            return;
        }
        if (dxyVar.m() == 1) {
            LogUtil.a(TAG, "handleWorkMode goingConnected == DeviceWorkMode.RUN_WORK_MODE");
            wearRunWorkMode(dxyVar, wearDeviceList);
        } else {
            LogUtil.a(TAG, "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE");
            wearRunOtherMode(dxyVar, wearDeviceList);
            this.mDeviceInfoUtilsApi.resetUpdate();
        }
        sHandler.sendEmptyMessageDelayed(1, 20000L);
    }

    private void wearRunWorkMode(dxy dxyVar, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.a(TAG, "wearRunWorkMode handleWorkMode set device enable");
                deviceInfo.setDeviceActiveState(1);
                deviceInfo.setDeviceConnectState(1);
            }
            if (!dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && deviceInfo.getAutoDetectSwitchStatus() == 1 && deviceInfo.getDeviceActiveState() == 1) {
                LogUtil.a(TAG, "wearRunWorkMode handleWorkMode target device disable");
                deviceInfo.setDeviceActiveState(0);
                deviceInfo.setDeviceConnectState(3);
            }
        }
    }

    private void wearRunOtherMode(dxy dxyVar, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.a(TAG, "wearRunOtherMode handleWorkMode set device enable");
                deviceInfo.setDeviceActiveState(1);
                deviceInfo.setDeviceConnectState(1);
            }
            if (!dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && deviceInfo.getAutoDetectSwitchStatus() != 1 && deviceInfo.getDeviceActiveState() == 1) {
                LogUtil.a(TAG, "wearRunOtherMode handleWorkMode target device disable");
                deviceInfo.setDeviceActiveState(0);
                deviceInfo.setDeviceConnectState(3);
            }
        }
    }

    private void setAddButton(final String str) {
        HealthToolBar healthToolBar = (HealthToolBar) this.child.findViewById(R.id.buttomview);
        healthToolBar.setVisibility(0);
        healthToolBar.d(LayoutInflater.from(dxw.d()).inflate(R.layout.hw_toolbar_bottomview, (ViewGroup) null));
        healthToolBar.setIconVisible(1, 8);
        healthToolBar.setIcon(2, R.drawable.ic_addition_create_group);
        healthToolBar.setIconTitle(2, this.mainActivity.getResources().getString(R.string.IDS_contact_add));
        healthToolBar.setIconVisible(3, 8);
        healthToolBar.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda7
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f$0.m993x42e52e38(str, i);
            }
        });
        healthToolBar.a(this.mainActivity);
    }

    /* JADX INFO: renamed from: lambda$setAddButton$1$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment, reason: not valid java name */
    /* synthetic */ void m993x42e52e38(String str, int i) {
        if (i != 2) {
            return;
        }
        if ("me".equals(str)) {
            switchFragment(new DeviceBindingFragment(), str);
        } else {
            switchFragment(new DeviceBindingFragment());
        }
    }

    private void getWiFiDevice() {
        elh elhVarD;
        ArrayList<String> bondedWiFiDevices = this.mHealthDeviceEntryApi.getBondedWiFiDevices();
        if (bondedWiFiDevices != null && bondedWiFiDevices.size() > 0) {
            Iterator<String> it = bondedWiFiDevices.iterator();
            while (it.hasNext()) {
                String wiFiDeviceProductId = ((DataBaseapiApi) Services.b("PluginDevice", DataBaseapiApi.class)).getWiFiDeviceProductId(it.next());
                if (!TextUtils.isEmpty(wiFiDeviceProductId) && (elhVarD = ResourceManager.c().d(wiFiDeviceProductId)) != null && !elhVarD.l().b().trim().isEmpty()) {
                    this.mProductInfoList.add(elhVarD);
                }
            }
        }
        ArrayList<dru> arrayListD = ekd.d(this.mProductInfoList);
        if (arrayListD.size() > 0) {
            this.mProductList.addAll(arrayListD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initList(HealthDevice.HealthDeviceKind healthDeviceKind) {
        int i;
        LogUtil.a(TAG, "enter initList");
        clearList();
        if (this.mIsShowWiFiDevice) {
            getWiFiDevice();
            return;
        }
        boolean z = this.isFromFitnessAdvice && healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_HEART_RATE;
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_UNKNOWN || z) {
            addWearDeviceInfo(healthDeviceKind);
            i = 0;
            for (dxy dxyVar : this.mWearInfoList) {
                dru druVar = new dru();
                druVar.d(1);
                String strD = dxyVar.d();
                String strN = dxyVar.n();
                ContentValues contentValues = new ContentValues();
                contentValues.put("uniqueId", strD);
                contentValues.put("productId", strN);
                druVar.a(contentValues);
                druVar.c(dxyVar);
                if (dxyVar.b() == 2) {
                    i++;
                    this.mDeviceGroupInfoList.add(0, druVar);
                } else {
                    this.mDeviceGroupInfoList.add(druVar);
                }
                ProductListAdapter productListAdapter = this.mProductAdapter;
                boolean z2 = productListAdapter != null && productListAdapter.getConnecting();
                String str = this.mReconnectDevice;
                boolean z3 = str != null && str.equals(dxyVar.d());
                if (z2 && z3) {
                    dxyVar.b(1);
                }
                LogUtil.d(TAG, " has wear device name :" + dxyVar.i());
                LogUtil.d(TAG, " has wear device state :" + dxyVar.b());
            }
        } else {
            i = 0;
        }
        LogUtil.a(TAG, " has wear DEVICE_CONNECTED : " + i);
        compareDevice(this.mHealthDeviceEntryApi.getBondedDeviceByDeviceKind(healthDeviceKind));
        if (i > 0 && this.mDeviceGroupInfoList.size() > i) {
            addProduct(this.mDeviceGroupInfoList.subList(0, i));
            ArrayList<dru> arrayList = this.mProductList;
            ArrayList<dru> arrayList2 = this.mDeviceGroupInfoList;
            arrayList.addAll(arrayList2.subList(i, arrayList2.size()));
        } else {
            this.mProductList.addAll(this.mDeviceGroupInfoList);
        }
        LogUtil.a(TAG, "MyDeviceFragment productInfos size is ", Integer.valueOf(this.mProductList.size()), "list_compare size is ", Integer.valueOf(this.mListCompare.size()));
    }

    private void clearList() {
        this.mProductList.clear();
        this.mDeviceGroupInfoList.clear();
        this.mProductInfoList.clear();
        this.mListCompare.clear();
        this.mWearInfoList.clear();
    }

    private void addProduct(List<dru> list) {
        for (int i = 0; i < list.size(); i++) {
            dru druVar = list.get(i);
            if (i == list.size() - 1) {
                druVar.d(true);
            } else {
                druVar.d(false);
            }
            this.mProductList.add(druVar);
        }
        dru druVar2 = new dru();
        druVar2.d(3);
        druVar2.c(new Object());
        this.mProductList.add(druVar2);
    }

    private void addWearDeviceInfo(HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (this.isFromFitnessAdvice && healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_HEART_RATE) {
            ArrayList<dxy> wearInfoHeartRate = this.mDeviceInfoUtilsApi.getWearInfoHeartRate(this.mNotHeartRateDeviceList);
            if (wearInfoHeartRate.size() <= 0 || !CommonUtil.ck()) {
                return;
            }
            LogUtil.d(TAG, " has wear device getWearInfoHeartRate");
            this.mWearInfoList = wearInfoHeartRate;
            return;
        }
        if (this.mDeviceInfoUtilsApi.getWearInfo().size() <= 0 || !CommonUtil.ck()) {
            return;
        }
        LogUtil.d(TAG, " has wear device");
        this.mWearInfoList = this.mDeviceInfoUtilsApi.getWearInfo();
    }

    private void compareDevice(ArrayList<ContentValues> arrayList) {
        for (ContentValues contentValues : arrayList) {
            elh elhVarD = ResourceManager.c().d(contentValues.getAsString("productId"));
            if (elhVarD == null) {
                LogUtil.j(TAG, "MyDeviceFragment compareDevice get productInfo is null");
            } else {
                dru druVar = new dru();
                druVar.a(contentValues);
                druVar.c(elhVarD);
                druVar.d(0);
                druVar.d(elhVarD.j());
                druVar.d(new dsa("deviceUsedTime").b(dxw.d(), contentValues.getAsString("uniqueId")));
                this.mDeviceGroupInfoList.add(druVar);
            }
        }
        Collections.sort(this.mDeviceGroupInfoList);
        LogUtil.a(TAG, "MyDeviceFragment mProductInfoList size is " + this.mDeviceGroupInfoList.size());
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        initList(this.mKind);
        this.mProductAdapter.notifyDataSetChanged();
        showEmpty();
        if (ecu.d().getDeviceStateById(DeviceStateConstants.BATTERY, null, "", TAG) != -1) {
            this.mProductAdapter.notifyDataSetChanged();
            LogUtil.a(TAG, "Device's battery is not -1 , battery is " + ecu.d().getDeviceStateById(DeviceStateConstants.BATTERY, null, "", TAG));
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        WeakReference<MyDeviceFragment> weakReference = sFragment;
        if (weakReference != null) {
            weakReference.clear();
        }
        ResourceManager.c().f();
        if (CommonUtil.ck()) {
            unRegisterBatteryBroadcast();
            try {
                LogUtil.a(TAG, "unregisterWearBroadcast");
                BaseApplication.getContext().unregisterReceiver(NON_LOCAL_BROAD_CASTRECEIVER);
            } catch (IllegalArgumentException e) {
                LogUtil.a(TAG, e.getMessage());
            } catch (Exception unused) {
                LogUtil.a(TAG, "unregisterReceiver Exception");
            }
        }
    }

    private void entryTypeEqualsPick(final elh elhVar) {
        if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getActivity());
            builder.b(R.string.IDS_device_bluetooth_open_request);
            builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m991xc6888e56(elhVar, view);
                }
            });
            builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m992xff68eef5(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            return;
        }
        LogUtil.a(TAG, "MyDeviceFragment sendMessage with bluetooth open");
        sendMessageInMyDeviceFragment(elhVar);
    }

    /* JADX INFO: renamed from: lambda$entryTypeEqualsPick$2$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment, reason: not valid java name */
    /* synthetic */ void m991xc6888e56(elh elhVar, View view) {
        LogUtil.a(TAG, "MyDeviceFragment sendMessage with bluetooth off");
        sendMessageInMyDeviceFragment(elhVar);
    }

    /* JADX INFO: renamed from: lambda$entryTypeEqualsPick$3$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment, reason: not valid java name */
    /* synthetic */ void m992xff68eef5(View view) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = CLICK_BUTTON_NO;
        dxw.a(TAG, messageObtain);
        getActivity().finish();
    }

    private void entryTypeEqualsMeasure(dru druVar) {
        elh elhVar = (elh) druVar.i();
        ContentValues contentValuesD = druVar.d();
        String asString = contentValuesD != null ? contentValuesD.getAsString("uniqueId") : "";
        Fragment measureFragment = ((DeviceFragmentFactoryApi) Services.b("PluginDevice", DeviceFragmentFactoryApi.class)).getMeasureFragment(elhVar.t());
        if (measureFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putString(VIEW, "measure");
            bundle.putString("productId", elhVar.t());
            bundle.putParcelable("commonDeviceInfo", contentValuesD);
            bundle.putString(KIND, elhVar.m().name());
            measureFragment.setArguments(bundle);
            switchFragment(measureFragment);
            return;
        }
        if ("H5".equals(elhVar.e()) && "H5".equals(elhVar.p())) {
            checkHealthKitLinked(elhVar, asString);
        } else if ("H5".equals(elhVar.p())) {
            jumpToWebViewActivity(elhVar, asString);
        } else {
            jumpToSilentGuideOrMeasureFragment(druVar, elhVar, asString);
        }
    }

    private void jumpToSilentGuideOrMeasureFragment(dru druVar, elh elhVar, String str) {
        if (this.mHealthDeviceEntryApi.isDeviceKitUniversal(elhVar.t())) {
            com.huawei.hihealth.device.open.HealthDevice bondedDeviceUniversal = this.mHealthDeviceEntryApi.getBondedDeviceUniversal(elhVar.t(), str);
            elh elhVarD = ResourceManager.c().d(elhVar.t());
            if (elhVarD != null && bondedDeviceUniversal != null) {
                if (HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(elhVarD.r())) {
                    jumpToSilentGuideFragment(druVar);
                    return;
                } else {
                    jumpToMeasureFragment(druVar);
                    return;
                }
            }
            LogUtil.e(TAG, "the productInfo or device is null");
            return;
        }
        MeasurableDevice measurableDevice = this.mHealthDeviceEntryApi.getBondedDevice(elhVar.t()) instanceof MeasurableDevice ? (MeasurableDevice) this.mHealthDeviceEntryApi.getBondedDevice(elhVar.t()) : null;
        boolean zEquals = HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(elhVar.r());
        if (measurableDevice != null) {
            if (measurableDevice.isAutoDevice() && zEquals) {
                jumpToSilentGuideFragment(druVar);
                return;
            } else {
                jumpToMeasureFragment(druVar);
                return;
            }
        }
        LogUtil.e(TAG, "device is null!");
    }

    private void checkHealthKitLinked(elh elhVar, String str) {
        if ("true".equals(ioi.d().c(402))) {
            etn.o(elhVar.t());
            jumpToWebViewActivity(elhVar, str);
        } else {
            etn.b(this.mainActivity, elhVar.t(), str, true);
        }
    }

    private void jumpToWebViewActivity(elh elhVar, String str) {
        etn.o(elhVar.t());
        if ("1".equals(elhVar.g())) {
            etn.c(getContext(), elhVar, elhVar.t(), str);
        } else {
            Intent intent = new Intent();
            intent.setPackage(dmz.y);
            intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
            if (!TextUtils.isEmpty(elhVar.p()) && !TextUtils.isEmpty(elhVar.e())) {
                intent.putExtra("url", elg.e().e(elhVar.t()) + "#/type=2/sn=" + str);
            } else {
                intent.putExtra("url", elg.e().e(elhVar.t()));
            }
            intent.putExtra("productId", elhVar.t());
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", str);
            contentValues.put("name", etn.c(elhVar.t(), elhVar.l().d()));
            contentValues.put("deviceType", elhVar.m().name());
            contentValues.put(Constants.KEY_BLE_SCAN_MODE, Integer.valueOf(elhVar.v().c()));
            intent.putExtra("commonDeviceInfo", contentValues);
            intent.putExtra("bleIntroductionType", elhVar.n().b());
            if (!TextUtils.isEmpty(WebViewActivity.getProductId())) {
                LogUtil.a(TAG, "WebViewActivity productId is not empty");
                intent.setFlags(335544320);
            }
            startActivity(intent);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private void jumpToSilentGuideFragment(dru druVar) {
        DeviceSilentGuideFragment deviceSilentGuideFragment = new DeviceSilentGuideFragment();
        elh elhVar = (elh) druVar.i();
        Bundle bundle = new Bundle();
        bundle.putString(VIEW, "bond");
        bundle.putString("productId", elhVar.t());
        bundle.putParcelable("commonDeviceInfo", druVar.d());
        deviceSilentGuideFragment.setArguments(bundle);
        switchFragment(deviceSilentGuideFragment);
    }

    private void jumpToMeasureFragment(dru druVar) {
        if (druVar != null) {
            elh elhVar = (elh) druVar.i();
            Bundle bundle = new Bundle();
            String strT = elhVar.t();
            if (this.mHonourDeviceConstantsApi.isHuaweiWspScaleProduct(strT)) {
                LogUtil.a(TAG, "MyDeviceFragment hygrid scale set type:", -1);
                bundle.putInt("type", -1);
            }
            bundle.putString(VIEW, "measure");
            bundle.putString(KIND, elhVar.m().name());
            bundle.putString("productId", strT);
            bundle.putParcelable("commonDeviceInfo", druVar.d());
            Fragment measureFragment = ((DeviceFragmentFactoryApi) Services.b("PluginDevice", DeviceFragmentFactoryApi.class)).getMeasureFragment(elhVar.m().name());
            if (measureFragment != null) {
                measureFragment.setArguments(bundle);
            }
            switchFragment(measureFragment);
        }
    }

    private void entryTypeEqualsList(final int i, final elh elhVar, final dru druVar) {
        Fragment productIntroductionFragment;
        if (elhVar.d().size() <= 0) {
            LogUtil.a(TAG, "MyDeviceFragment Disassociate this device?");
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getActivity());
            builder.b(R.string.IDS_device_selection_cancel_unbind_device);
            builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m990x6eef7077(druVar, elhVar, i, view);
                }
            });
            builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDeviceFragment.lambda$entryTypeEqualsList$5(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            return;
        }
        ContentValues contentValuesD = druVar.d();
        Bundle bundle = new Bundle();
        bundle.putString("productId", elhVar.t());
        DeviceMainActivityApi deviceMainActivityApi = (DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class);
        if (this.mHonourDeviceConstantsApi.isHuaweiWspScaleProduct(elhVar.t())) {
            productIntroductionFragment = deviceMainActivityApi.getPluginDeviceFragment(WeightConstants.FragmentType.HAGRID_DEVICE_MANAGER);
        } else if (this.mHonourDeviceConstantsApi.isHonourNewDevice(elhVar.t())) {
            productIntroductionFragment = deviceMainActivityApi.getPluginDeviceFragment(WeightConstants.FragmentType.HONOUR_DEVICE);
        } else if (this.mDeviceInfoUtilsApi.isWiFiDevice(elhVar.t())) {
            productIntroductionFragment = deviceMainActivityApi.getPluginDeviceFragment(WeightConstants.FragmentType.WIFI_PRODUCT_INTRODUCTION);
        } else {
            productIntroductionFragment = new ProductIntroductionFragment();
        }
        if (productIntroductionFragment == null) {
            LogUtil.j(TAG, "entryTypeEqualsList fragment is null");
            return;
        }
        bundle.putParcelable("commonDeviceInfo", contentValuesD);
        productIntroductionFragment.setArguments(bundle);
        switchFragment(productIntroductionFragment);
    }

    /* JADX INFO: renamed from: lambda$entryTypeEqualsList$4$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment, reason: not valid java name */
    /* synthetic */ void m990x6eef7077(dru druVar, elh elhVar, int i, View view) {
        if (this.mHealthDeviceEntryApi.unbindDeviceByUniqueId(druVar.d().getAsString("uniqueId"))) {
            this.mHealthDeviceEntryApi.stopMeasure(elhVar.t(), druVar.d().getAsString("uniqueId"));
            this.mProductList.remove(i);
            this.mProductAdapter.notifyDataSetChanged();
            showEmpty();
        }
    }

    private void sendMessageInMyDeviceFragment(elh elhVar) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = elhVar.t();
        messageObtain.what = 1;
        dxw.a(TAG, messageObtain);
        getActivity().finish();
    }

    class BindResourceFileListener implements ResourceFileListener {
        private BindResourceFileListener() {
        }

        @Override // com.huawei.health.device.manager.ResourceFileListener
        public void onResult(int i, String str) {
            boolean z;
            LogUtil.a(MyDeviceFragment.TAG, "MyDeviceFragment resultCode is ", Integer.valueOf(i), " resultValue is ", str);
            Iterator it = MyDeviceFragment.this.mListCompare.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((ContentValues) it.next()).getAsString("productId").equals(str)) {
                    z = true;
                    break;
                }
            }
            if (i == 200 && z) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                messageObtain.obj = str;
                MyDeviceFragment.this.mBindHandler.sendMessage(messageObtain);
            }
        }
    }

    class ProductListAdapter extends com.huawei.health.ecologydevice.ui.measure.adapter.ListAdapter {
        private static final int NORMAL_ITEM = 0;
        private static final int SUB_COLUMN_ITEM = 1;
        private boolean isConnecting = false;
        HealthProgressBar mLoadingImg;

        ProductListAdapter(ArrayList<dru> arrayList) {
            LogUtil.a(MyDeviceFragment.TAG, "ProductListAdapter list.size" + arrayList.size());
            MyDeviceFragment.this.mProductList = arrayList;
            super.setProductList(MyDeviceFragment.this.mProductList);
        }

        public void setOnItemReconnectListener(OnItemReconnectListener onItemReconnectListener) {
            MyDeviceFragment.this.mOnItemReconnectListener = onItemReconnectListener;
        }

        public void stopLoading() {
            HealthProgressBar healthProgressBar = this.mLoadingImg;
            if (healthProgressBar != null) {
                healthProgressBar.setVisibility(8);
            }
        }

        public void startLoading() {
            HealthProgressBar healthProgressBar = this.mLoadingImg;
            if (healthProgressBar != null) {
                healthProgressBar.setVisibility(0);
            }
        }

        public void setConnecting(boolean z) {
            this.isConnecting = z;
        }

        public boolean getConnecting() {
            return this.isConnecting;
        }

        @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ListAdapter
        public void setProductList(ArrayList<dru> arrayList) {
            super.setProductList(arrayList);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (MyDeviceFragment.this.mProductList == null || i >= MyDeviceFragment.this.mProductList.size() || ((dru) MyDeviceFragment.this.mProductList.get(i)).e() != 3) ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            LogUtil.a(MyDeviceFragment.TAG, "getView first position:" + i);
            LogUtil.a(MyDeviceFragment.TAG, "MyDeviceFragment getItemViewType: " + getItemViewType(i));
            if (getItemViewType(i) == 1) {
                return LayoutInflater.from(dxw.d()).inflate(R.layout.my_device_list_result_sub_item, (ViewGroup) null);
            }
            View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.my_device_list_result, (ViewGroup) null);
            if (viewInflate == null) {
                LogUtil.a(MyDeviceFragment.TAG, "getView convertView is null");
                return viewInflate;
            }
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.reconnect_layout);
            HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.reconnect_loading_img);
            this.mLoadingImg = healthProgressBar;
            healthProgressBar.setLayerType(1, null);
            dealAdapterConvertView(viewInflate, i, healthButton);
            return viewInflate;
        }

        private void dealAdapterConvertView(View view, int i, HealthButton healthButton) {
            dru druVar;
            if (MyDeviceFragment.this.mProductList == null || i >= MyDeviceFragment.this.mProductList.size()) {
                LogUtil.e(MyDeviceFragment.TAG, "ProductListAdapter dealAdapterConvertView position is invalid");
                return;
            }
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.device_manager_on_device_device_name_tv);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_device_icon_bind);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_device_icon_bind_wear);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.device_manager_on_device_device_states_info_rl);
            linearLayout.setVisibility(8);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.device_manager_on_device_connect_states_iv);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.device_manager_on_device_connect_states_tv);
            HealthDivider healthDivider = (HealthDivider) view.findViewById(R.id.hw_show_main_layout_sport_bottom_image_interval);
            ImageView imageView4 = (ImageView) view.findViewById(R.id.rightarrow_icon);
            clickItemRelativeLayout(i, (RelativeLayout) view.findViewById(R.id.iv_device_icon_rl_rl), imageView4, healthDivider);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.device_manager_on_device_battery_level_rl);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.reconnect_loading_layout);
            HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.device_manager_on_device_battery_level_tv);
            ImageView imageView5 = (ImageView) view.findViewById(R.id.device_manager_on_device_battery_level_iv);
            dru druVar2 = (dru) MyDeviceFragment.this.mProductList.get(i);
            if (druVar2.e() == 1) {
                dxy dxyVar = (dxy) druVar2.i();
                dealWearInitState(dxyVar, healthTextView, imageView, imageView2, linearLayout);
                if (dxyVar.b() == 2) {
                    LogUtil.a(MyDeviceFragment.TAG, "getView deviceGroupInfo.isLine():" + druVar2.h());
                    dealSplitLine(druVar2, healthDivider);
                    if (MyDeviceFragment.this.mVersionMgrApi.isDeviceOtaUpdating(dxyVar.d())) {
                        LogUtil.a(MyDeviceFragment.TAG, "current device is OTAing");
                        upgradeCondition(imageView4, relativeLayout, linearLayout2, imageView3, healthTextView2);
                    } else {
                        doWithoutUpgradeCondition(dxyVar, healthTextView3, relativeLayout, imageView5, imageView3);
                        dealViewWhetherVisible(imageView4, healthTextView2, healthButton, linearLayout2);
                    }
                    druVar = druVar2;
                } else {
                    druVar = druVar2;
                    if (dxyVar.b() == 1) {
                        imageView4.setVisibility(8);
                        dealDeviceConnectState(healthTextView2, imageView3, relativeLayout, healthButton, linearLayout2);
                    } else {
                        imageView4.setVisibility(8);
                        healthTextView2.setText(R.string.IDS_myfitnesspal_logout);
                        dealDeviceOtherState(dxyVar, imageView3, relativeLayout, linearLayout2, healthButton);
                    }
                }
            } else {
                druVar = druVar2;
            }
            dealThirdDevice(druVar, imageView4, imageView2, imageView, healthTextView);
        }

        private void dealViewWhetherVisible(ImageView imageView, HealthTextView healthTextView, HealthButton healthButton, LinearLayout linearLayout) {
            imageView.setVisibility(0);
            healthTextView.setText(R.string.IDS_myfitnesspal_login);
            healthButton.setVisibility(8);
            linearLayout.setVisibility(8);
        }

        private void clickItemRelativeLayout(final int i, RelativeLayout relativeLayout, ImageView imageView, HealthDivider healthDivider) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$ProductListAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m994x7043c13(i, view);
                }
            });
            dealLanguageAndSplitLine(imageView, i, healthDivider);
        }

        /* JADX INFO: renamed from: lambda$clickItemRelativeLayout$0$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment$ProductListAdapter, reason: not valid java name */
        /* synthetic */ void m994x7043c13(int i, View view) {
            MyDeviceFragment.this.mOnItemReconnectListener.onItemClick(i);
        }

        private void dealSplitLine(dru druVar, HealthDivider healthDivider) {
            if (druVar.h()) {
                healthDivider.setVisibility(8);
            } else {
                healthDivider.setVisibility(0);
            }
        }

        private void dealDeviceConnectState(HealthTextView healthTextView, ImageView imageView, RelativeLayout relativeLayout, HealthButton healthButton, LinearLayout linearLayout) {
            healthTextView.setText(R.string.IDS_myfitnesspal_logout);
            imageView.setBackgroundResource(R.mipmap.ic_bluetooth_close_new);
            relativeLayout.setVisibility(8);
            healthButton.setVisibility(8);
            linearLayout.setVisibility(0);
            startLoading();
        }

        private void dealWearInitState(dxy dxyVar, HealthTextView healthTextView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout) {
            LogUtil.a(MyDeviceFragment.TAG, "getView wear device state:" + dxyVar.b());
            LogUtil.a(MyDeviceFragment.TAG, "getView wear device name:" + dxyVar.i());
            LogUtil.a(MyDeviceFragment.TAG, "getView wear device is connecting :" + this.isConnecting);
            healthTextView.setText(dxyVar.i());
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            loadDeviceType(dxyVar, imageView2);
            linearLayout.setVisibility(0);
        }

        private void dealDeviceOtherState(dxy dxyVar, ImageView imageView, RelativeLayout relativeLayout, LinearLayout linearLayout, HealthButton healthButton) {
            imageView.setBackgroundResource(R.mipmap.ic_bluetooth_close_new);
            relativeLayout.setVisibility(8);
            linearLayout.setVisibility(8);
            healthButton.setVisibility(0);
            healthButton.setTextColor(MyDeviceFragment.this.getResources().getColor(R.color.common_color_white));
            if (!this.isConnecting) {
                initReconnect(healthButton, linearLayout, dxyVar);
            } else {
                healthButton.setTextColor(MyDeviceFragment.this.getResources().getColor(R.color.common_black_20alpha));
                healthButton.setClickable(false);
            }
        }

        private void dealLanguageAndSplitLine(ImageView imageView, int i, HealthDivider healthDivider) {
            if (!LanguageUtil.ba(MyDeviceFragment.this.mContext)) {
                imageView.setImageDrawable(MyDeviceFragment.this.mContext.getResources().getDrawable(R.mipmap.btn_list_rightarrow));
            } else {
                imageView.setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
            if (i == getCount() - 1) {
                healthDivider.setVisibility(8);
            } else {
                healthDivider.setVisibility(0);
            }
        }

        private void doWithoutUpgradeCondition(dxy dxyVar, HealthTextView healthTextView, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2) {
            imageView2.setBackgroundResource(R.mipmap.ic_bluetooth_connected_new);
            int unused = MyDeviceFragment.sReconnectCount = 0;
            if (ecu.d().getDeviceStateById(DeviceStateConstants.BATTERY, dxyVar.d(), "", MyDeviceFragment.TAG) != -1) {
                relativeLayout.setVisibility(0);
                healthTextView.setText(ltc.c(ecu.d().getDeviceStateById(DeviceStateConstants.BATTERY, dxyVar.d(), "", MyDeviceFragment.TAG), 2, 0));
                imageView.setBackground(qrs.e(ecu.d().getDeviceStateById(DeviceStateConstants.BATTERY, dxyVar.d(), "", MyDeviceFragment.TAG)));
                return;
            }
            relativeLayout.setVisibility(8);
        }

        private void upgradeCondition(ImageView imageView, RelativeLayout relativeLayout, LinearLayout linearLayout, ImageView imageView2, HealthTextView healthTextView) {
            imageView.setVisibility(8);
            relativeLayout.setVisibility(8);
            linearLayout.setVisibility(0);
            this.mLoadingImg.setVisibility(0);
            imageView2.setVisibility(8);
            healthTextView.setText(R.string.IDS_ota_update_state_upgrading);
        }

        private void dealThirdDevice(dru druVar, ImageView imageView, ImageView imageView2, ImageView imageView3, HealthTextView healthTextView) {
            String asString;
            if (druVar.e() == 0) {
                imageView.setVisibility(8);
                elh elhVar = druVar.i() instanceof elh ? (elh) druVar.i() : null;
                ContentValues contentValuesD = druVar.d();
                if (contentValuesD == null) {
                    asString = "";
                } else {
                    asString = contentValuesD.getAsString("sn");
                    if (TextUtils.isEmpty(asString)) {
                        asString = contentValuesD.getAsString("uniqueId");
                    }
                }
                imageView2.setVisibility(8);
                imageView3.setVisibility(0);
                if (elhVar == null) {
                    LogUtil.j(MyDeviceFragment.TAG, "dealThirdDevice productInfo is null");
                    healthTextView.setText((CharSequence) null);
                    imageView3.setImageResource(0);
                    imageView3.setImageBitmap(null);
                    return;
                }
                if (elhVar.d().size() <= 0) {
                    healthTextView.setText(elhVar.l().d() + "\n" + elhVar.l().e());
                    imageView3.setImageResource(elo.a(elhVar.l().b()));
                    return;
                }
                if (!TextUtils.isEmpty(asString)) {
                    String strReplaceAll = asString.replaceAll(":", "");
                    if (strReplaceAll.length() > 3) {
                        strReplaceAll = strReplaceAll.substring(strReplaceAll.length() - 3);
                    }
                    healthTextView.setText(elo.a(elhVar.t(), elhVar.l().d()) + com.huawei.openalliance.ad.constant.Constants.LINK + strReplaceAll);
                } else {
                    healthTextView.setText(elo.a(elhVar.t(), elhVar.l().d()));
                }
                imageView3.setImageBitmap(elo.c(elg.e().d(elhVar.t(), elhVar.l().b())));
            }
        }

        private void loadDeviceType(dxy dxyVar, ImageView imageView) {
            int iG = dxyVar.g();
            if (MyDeviceFragment.this.mDeviceInfoUtilsApi.isPluginDownloadByType(iG)) {
                LogUtil.a(MyDeviceFragment.TAG, "is plugin download");
                String uUIDForPlugin = MyDeviceFragment.this.mDeviceInfoUtilsApi.getUUIDForPlugin(iG);
                LogUtil.a(MyDeviceFragment.TAG, "is plugin download uuid:" + uUIDForPlugin);
                boolean zJ = EzPluginManager.b().j(uUIDForPlugin);
                LogUtil.a(MyDeviceFragment.TAG, "is plugin download pluginAvailable:" + zJ);
                loadPlugin(zJ, uUIDForPlugin, imageView, iG);
                return;
            }
            if (!TextUtils.isEmpty(dxyVar.i()) && dxyVar.i().contains("HUAWEI CM-R1P")) {
                imageView.setBackgroundResource(R.mipmap.id_devicemanager_r1_pro);
                return;
            }
            try {
                imageView.setBackgroundResource(Integer.parseInt(dxyVar.n()));
            } catch (NumberFormatException unused) {
                LogUtil.a(MyDeviceFragment.TAG, "loadDeviceType NumberFormatException");
            }
        }

        private void loadPlugin(boolean z, String str, ImageView imageView, int i) {
            if (!z) {
                if (MyDeviceFragment.this.mDeviceInfoUtilsApi.isDeviceBand(i)) {
                    imageView.setBackgroundResource(R.mipmap.device_icon_band_default);
                    return;
                } else {
                    imageView.setBackgroundResource(R.mipmap.device_icon_watch_default);
                    return;
                }
            }
            pic picVarA = EzPluginManager.b().a(str);
            if (picVarA == null) {
                if (MyDeviceFragment.this.mDeviceInfoUtilsApi.isDeviceBand(i)) {
                    imageView.setBackgroundResource(R.mipmap.device_icon_band_default);
                    return;
                } else {
                    imageView.setBackgroundResource(R.mipmap.device_icon_watch_default);
                    return;
                }
            }
            LogUtil.a(MyDeviceFragment.TAG, "is plugin download img:" + picVarA.h().e());
            imageView.setBackground(new BitmapDrawable(EzPluginManager.b().a(picVarA, picVarA.h().e())));
        }

        private void initReconnect(final HealthButton healthButton, final LinearLayout linearLayout, final dxy dxyVar) {
            LogUtil.a(MyDeviceFragment.TAG, "enter initReconnect");
            healthButton.setClickable(true);
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$ProductListAdapter$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m997x1be638cc(healthButton, linearLayout, dxyVar, view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$initReconnect$3$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment$ProductListAdapter, reason: not valid java name */
        /* synthetic */ void m997x1be638cc(final HealthButton healthButton, final LinearLayout linearLayout, final dxy dxyVar, View view) {
            try {
                if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                    NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(MyDeviceFragment.this.mContext).a(MyDeviceFragment.this.mContext.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$ProductListAdapter$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f$0.m995x49d6aeca(healthButton, linearLayout, dxyVar, view2);
                        }
                    }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$ProductListAdapter$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f$0.m996x32de73cb(view2);
                        }
                    });
                    MyDeviceFragment.this.mCloseBtDialog = builderA.c();
                    MyDeviceFragment.this.mCloseBtDialog.setCancelable(false);
                    MyDeviceFragment.this.mCloseBtDialog.show();
                    return;
                }
                requestGpsPermission(healthButton, linearLayout, dxyVar, false);
            } catch (SecurityException e) {
                LogUtil.e(MyDeviceFragment.TAG, "initReconnect SecurityException:", ExceptionUtils.c(e));
            }
        }

        /* JADX INFO: renamed from: lambda$initReconnect$1$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment$ProductListAdapter, reason: not valid java name */
        /* synthetic */ void m995x49d6aeca(HealthButton healthButton, LinearLayout linearLayout, dxy dxyVar, View view) {
            LogUtil.a(MyDeviceFragment.TAG, "user choose open BT");
            try {
                if (BluetoothAdapter.getDefaultAdapter().enable()) {
                    requestGpsPermission(healthButton, linearLayout, dxyVar, true);
                }
            } catch (RuntimeException e) {
                LogUtil.a(MyDeviceFragment.TAG, "user choose open BT error :" + e.getMessage());
            }
        }

        /* JADX INFO: renamed from: lambda$initReconnect$2$com-huawei-health-ecologydevice-ui-measure-fragment-MyDeviceFragment$ProductListAdapter, reason: not valid java name */
        /* synthetic */ void m996x32de73cb(View view) {
            if (MyDeviceFragment.this.mCloseBtDialog != null) {
                MyDeviceFragment.this.mCloseBtDialog.dismiss();
                MyDeviceFragment.this.mCloseBtDialog = null;
            }
        }

        private void requestGpsPermission(final HealthButton healthButton, final LinearLayout linearLayout, final dxy dxyVar, final boolean z) {
            if (MyDeviceFragment.this.getActivity().isFinishing()) {
                return;
            }
            if (MyDeviceFragment.this.mDeviceInfoUtilsApi.getBtType(dxyVar.g()) == 2) {
                PermissionUtil.d(MyDeviceFragment.this.mContext, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(MyDeviceFragment.this.mContext) { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment.ProductListAdapter.1
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        ProductListAdapter.this.postConnect(healthButton, linearLayout, dxyVar, z);
                    }
                });
            } else {
                postConnect(healthButton, linearLayout, dxyVar, z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void postConnect(HealthButton healthButton, LinearLayout linearLayout, dxy dxyVar, boolean z) {
            if (z) {
                int unused = MyDeviceFragment.sReconnectCount = 0;
            }
            onclickReconnect(dxyVar, healthButton, linearLayout);
            MyDeviceFragment myDeviceFragment = MyDeviceFragment.this;
            myDeviceFragment.initList(myDeviceFragment.mKind);
            MyDeviceFragment.this.mProductAdapter.notifyDataSetChanged();
        }

        private void onclickReconnect(dxy dxyVar, HealthButton healthButton, LinearLayout linearLayout) {
            if (!MyDeviceFragment.this.mVersionMgrApi.isOtherDeviceOtaUpdating(dxyVar.d())) {
                if (MyDeviceFragment.this.mDeviceInfoUtilsApi.idCurrentDeviceActive(dxyVar.d()) || MyDeviceFragment.this.mDeviceInfoUtilsApi.getCurrentDeviceList().isEmpty()) {
                    MyDeviceFragment.this.startReconnect(dxyVar, healthButton, linearLayout);
                    return;
                } else {
                    handleWorkMode(dxyVar);
                    MyDeviceFragment.this.startReconnect(dxyVar, healthButton, linearLayout);
                    return;
                }
            }
            LogUtil.a(MyDeviceFragment.TAG, "user choose connect other wear device is OTAing");
            MyDeviceFragment.this.showTipDialog();
        }

        private void handleWorkMode(dxy dxyVar) {
            List<DeviceInfo> wearDeviceList = MyDeviceFragment.this.mDeviceInfoUtilsApi.getWearDeviceList();
            if (wearDeviceList == null) {
                LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode, mDeviceInfoList = null");
                return;
            }
            if (dxyVar.m() == 1) {
                LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode goingConnected == DeviceWorkMode.RUN_WORK_MODE");
                for (DeviceInfo deviceInfo : wearDeviceList) {
                    if (dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                        LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode set device enable");
                        deviceInfo.setDeviceActiveState(1);
                        deviceInfo.setDeviceConnectState(1);
                    }
                    if (!dxyVar.d().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && deviceInfo.getAutoDetectSwitchStatus() == 1 && deviceInfo.getDeviceActiveState() == 1) {
                        LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode target device disable");
                        deviceInfo.setDeviceActiveState(0);
                        deviceInfo.setDeviceConnectState(3);
                    }
                }
                return;
            }
            LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE");
            for (DeviceInfo deviceInfo2 : wearDeviceList) {
                if (dxyVar.d().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode set device enable");
                    deviceInfo2.setDeviceActiveState(1);
                    deviceInfo2.setDeviceConnectState(1);
                }
                if (!dxyVar.d().equalsIgnoreCase(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getAutoDetectSwitchStatus() != 1 && deviceInfo2.getDeviceActiveState() == 1) {
                    LogUtil.a(MyDeviceFragment.TAG, "handleWorkMode target device disable");
                    deviceInfo2.setDeviceActiveState(0);
                    deviceInfo2.setDeviceConnectState(3);
                }
            }
            MyDeviceFragment.this.mDeviceInfoUtilsApi.resetUpdate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startReconnect(dxy dxyVar, HealthButton healthButton, LinearLayout linearLayout) {
        LogUtil.a(TAG, "startReconnect sReconnectCount ：" + sReconnectCount);
        if (sReconnectCount < 2) {
            this.mReconnectDevice = dxyVar.d();
            this.mProductAdapter.setConnecting(true);
            this.mOnItemReconnectListener.onReconnect(dxyVar);
            this.mProductAdapter.setConnecting(true);
            healthButton.setVisibility(8);
            linearLayout.setVisibility(0);
            this.mProductAdapter.startLoading();
            sReconnectCount++;
            return;
        }
        createAlertDialog(this.mDeviceInfoUtilsApi.checkProductType(dxyVar.g()));
        sReconnectCount = 0;
    }

    private void createAlertDialog(View view) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.mContext);
        builder.a(this.mContext.getString(R.string.IDS_device_mgr_pair_note_can_not_connect)).d(view).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.a(MyDeviceFragment.TAG, "showAlertDialog onclick PositiveButton");
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.mCustomViewDialog = customViewDialogD;
        customViewDialogD.setCancelable(true);
        this.mCustomViewDialog.show();
    }

    private void openWearHome(String str) {
        LogUtil.a(TAG, "Enter openWearHome ");
        if (this.mVersionMgrApi.isOtherDeviceOtaUpdating(str)) {
            LogUtil.a(TAG, "Enter openWearHome other device is OTAing");
            showTipDialog();
            return;
        }
        if (this.mVersionMgrApi.isDeviceOtaUpdating(str)) {
            LogUtil.a(TAG, "Enter openWearHome wear device is OTAing");
            Intent intent = new Intent();
            intent.setClassName(this.mContext, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
            intent.putExtra("device_id", str);
            iov.d(this.mContext, intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(this.mContext, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent2.putExtra("device_id", str);
        iov.d(this.mContext, intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBandUnavailableDialog(Context context) {
        LogUtil.d(TAG, "showBandUnavailableDialog");
        boolean zI = CommonUtil.i(context, "com.huawei.health.device.ui.DeviceMainActivity");
        LogUtil.d(TAG, "isForeground : " + zI);
        if (zI) {
            CustomTextAlertDialog customTextAlertDialog = this.mDialog;
            if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
                LogUtil.d(TAG, "showBandUnavailableDialog Already show!");
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_service_area_notice_title).a(context.getString(R.string.IDS_band_is_unavailable_tip_string_newphone)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDeviceFragment.lambda$showBandUnavailableDialog$7(view);
                }
            }).b();
            this.mDialog = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.mDialog.isShowing()) {
                return;
            }
            this.mDialog.show();
        }
    }

    private void unRegisterBatteryBroadcast() {
        try {
            this.mContext.unregisterReceiver(DEVICE_BATTERY_RECEIVER);
        } catch (IllegalArgumentException e) {
            LogUtil.a(TAG, "unRegisterBatteryBroadcast Exception: " + e.getMessage());
        } catch (RuntimeException e2) {
            LogUtil.a(TAG, "unRegisterBatteryBroadcast Exception: " + e2.getMessage());
        }
    }

    private void registerBatteryBroadcast() {
        LogUtil.a(TAG, "enter registerBatteryBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.BATTERY_LEVEL");
        intentFilter.addAction("com.huawei.bone.action.BATTERY_LEVEL");
        BroadcastManagerUtil.c(BaseApplication.getContext(), DEVICE_BATTERY_RECEIVER, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTipDialog() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(this.mContext.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.MyDeviceFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a(MyDeviceFragment.TAG, "showTipDialog click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }
}
