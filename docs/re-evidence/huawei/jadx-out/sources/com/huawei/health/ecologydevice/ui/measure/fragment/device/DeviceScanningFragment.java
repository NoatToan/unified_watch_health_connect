package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.unitedevice.entity.UniteDevice;
import defpackage.dmm;
import defpackage.dxw;
import defpackage.efn;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.emk;
import defpackage.enq;
import defpackage.epq;
import defpackage.ept;
import defpackage.ete;
import defpackage.njy;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceScanningFragment extends BaseFragment {
    private static final int DEVICE_SCAN_FINISH = 2;
    private static final int DEVICE_SCAN_REFRESH = 0;
    private static final int DEVICE_SCAN_REFRESH_BY_UDS = 3;
    private static final int DEVICE_SCAN_TIMEOUT = 1;
    private static final String HEART_RATE_UNKNOWN_PRODUCT_ID = "aa:bb:cc:dd";
    private static final int MAX_DEVICE_NAME_LENGTH = 10;
    private static final int MIN_TEXT_SIZE = 10;
    private static final int RESULT_CODE_NOT_FOUND = 1001;
    private static final String TAG = "DeviceScanningFragment";
    private ProductListAdapter mAdapter;
    private BindCallback mBindCallback;
    private epq mDeviceManagerModel;
    private efn mDeviceScanManager;
    private HealthProgressBar mHealthProgressBar;
    private boolean mIsUniformDeviceManagementFlag;
    private String mProductId;
    private TextView mSearchDeviceTVPromptMsg;
    private LinearLayout mSearchLayout;
    private emk mThirdPartyDeviceManager;
    private String mTitle;
    private final ArrayList<HealthDevice> mHealthDeviceList = new ArrayList<>(10);
    private final ArrayList<ept> mThirdPartyUniteDeviceList = new ArrayList<>(10);
    private TextView mSearchMoreDeviceText = null;
    private String mScanKind = HealthDevice.HealthDeviceKind.HDK_UNKNOWN.name();
    private Handler mHandler = new Handler() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceScanningFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a(DeviceScanningFragment.TAG, "DeviceScanningFragment mHandler handleMessage:msg == null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                DeviceScanningFragment.this.deviceByUdsScanSuc(message);
                return;
            }
            if (i == 1) {
                DeviceScanningFragment.this.scanDeviceFinish();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                DeviceScanningFragment.this.deviceByUdsScanSuc(message);
            } else {
                DeviceScanningFragment.this.goneSearchLayout();
                if (njy.e(DeviceScanningFragment.this.mThirdPartyUniteDeviceList)) {
                    DeviceScanningFragment.this.scanDeviceFinish();
                }
            }
        }
    };
    private AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceScanningFragment.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            DeviceScanningFragment.this.stopScan();
            emk.c().a(DeviceScanningFragment.this.mDeviceManagerModel);
            if (DeviceScanningFragment.this.mIsUniformDeviceManagementFlag) {
                DeviceScanningFragment.this.mThirdPartyDeviceManager.d(DeviceScanningFragment.this.mDeviceManagerModel, i);
            }
            String strD = DeviceScanningFragment.this.mDeviceManagerModel.d(i);
            String strC = DeviceScanningFragment.this.mDeviceManagerModel.c(i);
            if (njy.c(DeviceScanningFragment.this.mThirdPartyUniteDeviceList, i) || njy.c(DeviceScanningFragment.this.mHealthDeviceList, i)) {
                String strJudgeProductIdByDeviceName = DeviceScanningFragment.this.judgeProductIdByDeviceName(strD);
                LogUtil.a(DeviceScanningFragment.TAG, "DeviceScanningFragment productId by deviceName ", strJudgeProductIdByDeviceName, " origin productId", DeviceScanningFragment.this.mProductId);
                if (!TextUtils.isEmpty(strJudgeProductIdByDeviceName)) {
                    DeviceScanningFragment.this.mProductId = strJudgeProductIdByDeviceName;
                }
            } else if (!TextUtils.isEmpty(strD) && !TextUtils.isEmpty(DeviceScanningFragment.this.judgeProductIdByDeviceName(strD))) {
                DeviceScanningFragment deviceScanningFragment = DeviceScanningFragment.this;
                deviceScanningFragment.mProductId = deviceScanningFragment.judgeProductIdByDeviceName(strD);
                LogUtil.a(DeviceScanningFragment.TAG, "the real productId is ", DeviceScanningFragment.this.mProductId);
            } else {
                LogUtil.j(DeviceScanningFragment.TAG, "the device name is null");
            }
            DeviceScanningFragment.this.initBundle(i, strD, strC);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void initBundle(int i, String str, String str2) {
        Bundle bundle = new Bundle();
        if (getProductInfo(this.mProductId) == null) {
            if (njy.e(this.mThirdPartyUniteDeviceList, i) && njy.e(this.mHealthDeviceList, i)) {
                LogUtil.a(TAG, "DeviceScanningFragment initBundle, data exception!");
                return;
            }
            setTitle(str);
            bundle.putString("productId", ResourceManager.c().a(str2, "SHA-256"));
            bundle.putString("scan_kind", this.mScanKind);
            bundle.putInt("position", i);
            bundle.putString("title", str);
            LogUtil.a(TAG, "DeviceScanningFragment productId is *****");
        } else {
            bundle.putString("productId", this.mProductId);
            bundle.putInt("position", i);
            bundle.putString("title", this.mTitle);
            LogUtil.a(TAG, "DeviceScanningFragment productId is ", this.mProductId);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", this.mProductId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putBoolean("from_scan_fragment", true);
        LogUtil.d(TAG, "DeviceScanningFragment position is ", Integer.valueOf(i), "DeviceScanningFragment productId is ", this.mProductId);
        Fragment pluginDeviceFragment = ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).getPluginDeviceFragment(WeightConstants.FragmentType.DEVICE_BIND_WAITING);
        pluginDeviceFragment.setArguments(bundle);
        switchFragment(pluginDeviceFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deviceByUdsScanSuc(Message message) {
        if (this.mIsUniformDeviceManagementFlag) {
            synchronized (this.mThirdPartyUniteDeviceList) {
                UniteDevice uniteDevice = (UniteDevice) message.obj;
                if (uniteDevice == null) {
                    return;
                }
                ept eptVar = new ept(uniteDevice.getIdentify(), uniteDevice.getDeviceInfo(), this.mProductId);
                if (!isDeviceExistInmListItems(eptVar.b().getDeviceMac()) && !isBondedDevice(this.mProductId, eptVar.d())) {
                    this.mThirdPartyUniteDeviceList.add(eptVar);
                    this.mDeviceManagerModel.d(this.mThirdPartyUniteDeviceList);
                    ProductListAdapter productListAdapter = this.mAdapter;
                    if (productListAdapter != null) {
                        productListAdapter.refreshData(this.mDeviceManagerModel);
                    }
                }
                return;
            }
        }
        synchronized (this.mHealthDeviceList) {
            HealthDevice healthDevice = message.obj instanceof HealthDevice ? (HealthDevice) message.obj : null;
            if (healthDevice == null) {
                LogUtil.j(TAG, "fuc deviceByUdsScanSuc device is null");
                return;
            }
            if (!isDeviceExistInmListItems(healthDevice.getAddress()) && !isBondedDevice(this.mProductId, healthDevice.getUniqueId())) {
                this.mHealthDeviceList.add(healthDevice);
                this.mDeviceManagerModel.c(this.mHealthDeviceList);
                ProductListAdapter productListAdapter2 = this.mAdapter;
                if (productListAdapter2 != null) {
                    productListAdapter2.refreshData(this.mDeviceManagerModel);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scanDeviceFinish() {
        if (this.mIsUniformDeviceManagementFlag) {
            synchronized (this.mThirdPartyUniteDeviceList) {
                if (njy.e(this.mThirdPartyUniteDeviceList)) {
                    gotoBindFailedFragment();
                }
            }
            return;
        }
        synchronized (this.mHealthDeviceList) {
            if (njy.e(this.mHealthDeviceList)) {
                gotoBindFailedFragment();
            } else {
                goneSearchLayout();
            }
        }
    }

    private void gotoBindFailedFragment() {
        DeviceBindFailedFragment deviceBindFailedFragment = new DeviceBindFailedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        deviceBindFailedFragment.setArguments(bundle);
        switchFragment(deviceBindFailedFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String judgeProductIdByDeviceName(String str) {
        return ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).judgeProductIdByDeviceName(str);
    }

    private boolean isDeviceExistInmListItems(String str) {
        if (str == null) {
            return false;
        }
        Iterator<String> it = this.mDeviceManagerModel.b().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean isBondedDevice(String str, String str2) {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (healthDeviceEntryApi.isDeviceKitUniversal(str)) {
            return healthDeviceEntryApi.getBondedDeviceUniversal(str, str2) != null;
        }
        return healthDeviceEntryApi.getBondedDeviceByUniqueId(str2) != null;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        elh productInfo;
        LogUtil.a(TAG, "DeviceScanningFragment onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.mProductId = arguments.getString("productId");
                ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
                if (contentValues != null) {
                    this.mProductId = contentValues.getAsString("productId");
                }
                String string = arguments.getString("scan_kind");
                this.mScanKind = string;
                if (TextUtils.isEmpty(string) && (productInfo = getProductInfo(this.mProductId)) != null) {
                    this.mScanKind = productInfo.m().name();
                }
                this.mTitle = arguments.getString("title");
            } catch (Exception unused) {
                LogUtil.e(TAG, "DeviceBindWaitingFragment onCreate Exception");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "DeviceScanningFragment onCreateView");
        if (layoutInflater == null) {
            LogUtil.j(TAG, "DeviceScanningFragment onCreateView inflater is null");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            return null;
        }
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        View viewInflate = layoutInflater.inflate(R.layout.device_measure_search_device, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
        }
        this.mSearchLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_device_search_layout);
        if (!"9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(this.mProductId)) {
            LinearLayout linearLayout = this.mSearchLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.hw_device_scanning_pb);
            this.mHealthProgressBar = healthProgressBar;
            healthProgressBar.setLayerType(1, null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.device_measure_search_prompt);
            this.mSearchDeviceTVPromptMsg = textView;
            textView.setText(R.string.IDS_device_measureactivity_device_searching);
            this.mSearchDeviceTVPromptMsg.setVisibility(0);
            ((HealthDivider) viewInflate.findViewById(R.id.divider_line)).setVisibility(8);
        } else {
            goneSearchLayout();
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.device_more_search_text);
        this.mSearchMoreDeviceText = textView2;
        textView2.setVisibility(4);
        epq epqVar = new epq();
        this.mDeviceManagerModel = epqVar;
        epqVar.c(this.mHealthDeviceList);
        this.mDeviceManagerModel.d(this.mThirdPartyUniteDeviceList);
        this.mAdapter = new ProductListAdapter(this.mDeviceManagerModel);
        this.mBindCallback = new BindCallback();
        ListView listView = (ListView) viewInflate.findViewById(R.id.data_source_activity_content_listview);
        listView.setAdapter((ListAdapter) this.mAdapter);
        listView.setOnItemClickListener(this.mOnItemClickListener);
        setTitle(this.mTitle);
        ete.d().d(this.mScanKind);
        this.mIsUniformDeviceManagementFlag = ete.d().b();
        return viewGroup2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goneSearchLayout() {
        LinearLayout linearLayout = this.mSearchLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public elh getProductInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return new elh();
        }
        return ResourceManager.c().d(str);
    }

    class ProductListAdapter extends BaseAdapter {
        private epq deviceManagerModel;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        ProductListAdapter(epq epqVar) {
            this.deviceManagerModel = epqVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void refreshData(epq epqVar) {
            this.deviceManagerModel = epqVar;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.deviceManagerModel.c();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (DeviceScanningFragment.this.mIsUniformDeviceManagementFlag) {
                ArrayList<ept> arrayListE = this.deviceManagerModel.e();
                if (arrayListE == null || i >= arrayListE.size()) {
                    return null;
                }
                return arrayListE.get(i);
            }
            ArrayList<HealthDevice> arrayListA = this.deviceManagerModel.a();
            if (arrayListA == null || i >= arrayListA.size()) {
                return null;
            }
            return arrayListA.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.my_device_bind_list, (ViewGroup) null);
            if (viewInflate == null) {
                LogUtil.j(DeviceScanningFragment.TAG, "DeviceScanningFragment getView convertView is null");
                return null;
            }
            if (i > this.deviceManagerModel.c()) {
                return viewInflate;
            }
            String strD = this.deviceManagerModel.d(i);
            String strC = this.deviceManagerModel.c(i);
            DeviceScanningFragment deviceScanningFragment = DeviceScanningFragment.this;
            if (deviceScanningFragment.getProductInfo(deviceScanningFragment.mProductId) == null) {
                supportMoreHeartRateDevice(strD, strC, viewInflate, i);
                return viewInflate;
            }
            ((TextView) viewInflate.findViewById(R.id.tv_device_content)).setText(strD);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_device_icon);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.more_heart_rate_device_icon);
            DeviceScanningFragment deviceScanningFragment2 = DeviceScanningFragment.this;
            elh productInfo = deviceScanningFragment2.getProductInfo(deviceScanningFragment2.mProductId);
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            if (productInfo != null) {
                imageView.setImageBitmap(elo.c(elg.e().d(DeviceScanningFragment.this.mProductId, productInfo.l().b())));
            }
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.tv_device_summary);
            if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(DeviceScanningFragment.this.mProductId)) {
                healthTextView.setVisibility(8);
            } else {
                healthTextView.setVisibility(0);
                healthTextView.setText("Mac: " + strC);
            }
            healthTextView.setAutoTextInfo(10, 1, 1);
            ((TextView) viewInflate.findViewById(R.id.tv_device_name)).setText(strD);
            LogUtil.a(DeviceScanningFragment.TAG, "DeviceScanningFragment item Device name is ", strD);
            ((TextView) viewInflate.findViewById(R.id.tv_mac_addr)).setText(strC);
            dealSplitLine(i, (HealthDivider) viewInflate.findViewById(R.id.hw_show_main_layout_sport_bottom_image_interval));
            return viewInflate;
        }

        private void supportMoreHeartRateDevice(String str, String str2, View view, int i) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_device_content);
            if (str != null && str.length() > 10) {
                healthTextView.setText(str);
            } else {
                healthTextView.setText("unknown");
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_device_icon);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.more_heart_rate_device_icon);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            imageView2.setImageResource(elo.a("ic_heartrate_devices"));
            TextView textView = (TextView) view.findViewById(R.id.tv_device_summary);
            textView.setVisibility(0);
            textView.setText(str2);
            dealSplitLine(i, (HealthDivider) view.findViewById(R.id.hw_show_main_layout_sport_bottom_image_interval));
        }

        private void dealSplitLine(int i, HealthDivider healthDivider) {
            if (healthDivider == null) {
                return;
            }
            if (i == getCount() - 1) {
                healthDivider.setVisibility(8);
            } else {
                healthDivider.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        LogUtil.a(TAG, "DeviceScanningFragment onStart");
        super.onStart();
        ProductListAdapter productListAdapter = this.mAdapter;
        if (productListAdapter != null) {
            productListAdapter.refreshData(this.mDeviceManagerModel);
        }
        this.mDeviceScanManager = new efn();
        startScanDevice();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        stopScan();
        return true;
    }

    private void startScanDevice() {
        if (this.mProductId != null) {
            this.mThirdPartyDeviceManager = emk.c();
            LogUtil.d(TAG, "DeviceScanningFragment startBinding mProductId is ", this.mProductId);
            elh productInfo = getProductInfo(this.mProductId);
            if (this.mIsUniformDeviceManagementFlag) {
                if (productInfo != null) {
                    this.mSearchMoreDeviceText.setVisibility(4);
                    this.mThirdPartyDeviceManager.c(ScanMode.BLE, this.mThirdPartyDeviceManager.d(this.mProductId), this.mBindCallback);
                    return;
                } else {
                    this.mSearchMoreDeviceText.setVisibility(4);
                    LogUtil.j(TAG, "productInfo == null: ");
                    this.mThirdPartyDeviceManager.c(ScanMode.BLE, this.mThirdPartyDeviceManager.e(), this.mBindCallback);
                    return;
                }
            }
            if (productInfo != null) {
                this.mSearchMoreDeviceText.setVisibility(4);
                LogUtil.a(TAG, "DeviceScanningFragment productInfo is not null");
                if (HEART_RATE_UNKNOWN_PRODUCT_ID.equals(this.mProductId) && productInfo.x() == null) {
                    productInfo.c(ScanFilter.c("moredevice", this.mScanKind, ScanFilter.MatchRule.FRONT));
                }
                this.mDeviceScanManager.a(productInfo.v(), productInfo.x(), this.mBindCallback);
                return;
            }
            this.mSearchMoreDeviceText.setVisibility(0);
            LogUtil.j(TAG, "DeviceScanningFragment for more heart rate device");
            dmm.e eVar = new dmm.e();
            eVar.e(1);
            eVar.b(10L, TimeUnit.SECONDS);
            this.mDeviceScanManager.a(eVar.b(), ScanFilter.c("moredevice", this.mScanKind, ScanFilter.MatchRule.FRONT), this.mBindCallback);
        }
    }

    public void stopScan() {
        efn efnVar;
        if (!this.mIsUniformDeviceManagementFlag && (efnVar = this.mDeviceScanManager) != null) {
            efnVar.c();
        }
        this.mBindCallback = null;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a(TAG, "DeviceScanningFragment onDestroy");
        super.onDestroy();
        stopScan();
        if (this.mIsUniformDeviceManagementFlag) {
            synchronized (this.mThirdPartyUniteDeviceList) {
                if (this.mAdapter != null) {
                    this.mAdapter = null;
                }
            }
            return;
        }
        synchronized (this.mHealthDeviceList) {
            if (this.mAdapter != null) {
                this.mAdapter = null;
            }
        }
    }

    class BindCallback implements IDeviceEventHandler, DeviceScanCallback {
        private BindCallback() {
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            LogUtil.a(DeviceScanningFragment.TAG, "Callback, onDeviceFound" + healthDevice.toString());
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.obj = healthDevice;
            DeviceScanningFragment.this.mHandler.sendMessage(messageObtain);
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onScanFailed(int i) {
            LogUtil.a(DeviceScanningFragment.TAG, "onScanFailed");
            if (i == 1) {
                LogUtil.j(DeviceScanningFragment.TAG, "scan timeout");
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                DeviceScanningFragment.this.mHandler.sendMessage(messageObtain);
                return;
            }
            if (i == 3) {
                LogUtil.j(DeviceScanningFragment.TAG, "scan bt disabled");
            } else {
                LogUtil.j(DeviceScanningFragment.TAG, "unknown code: ", Integer.valueOf(i));
            }
        }

        @Override // com.huawei.health.device.callback.IDeviceEventHandler
        public void onStateChanged(int i) {
            LogUtil.a(DeviceScanningFragment.TAG, "onStateChanged");
            if (i == 1001) {
                LogUtil.j(DeviceScanningFragment.TAG, "result code not found");
                boolean zC = enq.d().c();
                boolean zG = enq.d().g(DeviceScanningFragment.this.mProductId);
                if (zC && zG) {
                    HealthDevice healthDeviceB = enq.d().b(DeviceScanningFragment.this.mProductId);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 0;
                    messageObtain.obj = healthDeviceB;
                    DeviceScanningFragment.this.mHandler.sendMessage(messageObtain);
                    return;
                }
                return;
            }
            LogUtil.a(DeviceScanningFragment.TAG, "onStateChanged: code = ", Integer.valueOf(i));
        }

        @Override // com.huawei.devicesdk.callback.DeviceScanCallback
        public void scanResult(UniteDevice uniteDevice, byte[] bArr, String str, int i) {
            LogUtil.a(DeviceScanningFragment.TAG, "scanResult errorCode: ", Integer.valueOf(i));
            Message messageObtain = Message.obtain();
            if (i != 20 || uniteDevice == null) {
                if (i == 21) {
                    LogUtil.j(DeviceScanningFragment.TAG, "scan timeout");
                    messageObtain.what = 1;
                    DeviceScanningFragment.this.mHandler.sendMessage(messageObtain);
                    return;
                } else {
                    LogUtil.j(DeviceScanningFragment.TAG, "scanResult: ");
                    messageObtain.what = 2;
                    DeviceScanningFragment.this.mHandler.sendMessage(messageObtain);
                    return;
                }
            }
            String deviceName = uniteDevice.getDeviceInfo().getDeviceName();
            LogUtil.a(DeviceScanningFragment.TAG, "scanResult deviceName: ", deviceName);
            if (TextUtils.isEmpty(deviceName)) {
                LogUtil.j(DeviceScanningFragment.TAG, "deviceName is empty");
                return;
            }
            messageObtain.what = 3;
            messageObtain.obj = uniteDevice;
            DeviceScanningFragment.this.mHandler.sendMessage(messageObtain);
        }
    }
}
