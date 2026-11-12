package com.huawei.health.device.ui.measure.fragment.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ContentValues;
import android.content.IntentFilter;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.connectivity.comm.BleDeviceHelper;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.fragment.HonourDeviceFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.HeartRateDeviceRunGuide;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindFailedFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSilentGuideFragment;
import com.huawei.hihealth.device.open.HealthDevice;
import com.huawei.hihealth.device.open.IDeviceEventHandler;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.dmn;
import defpackage.dmp;
import defpackage.drw;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyj;
import defpackage.elh;
import defpackage.enq;
import defpackage.era;
import defpackage.etn;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceBindWaitingUniversalFragment extends BaseFragment implements View.OnClickListener {
    private static final int BIND_STATUS_FAIL = 3;
    private static final int BIND_STATUS_ING = 1;
    private static final int BIND_STATUS_SUCCESS = 2;
    private static final int DELAY_TIME = 1500;
    private static final int DEVICE_NOT_FOUND = 3;
    private static final int DEVICE_SCAN_FAIL = 2;
    private static final int DEVICE_SCAN_REFRESH = 0;
    private static final int DEVICE_SCAN_TIMEOUT = 1;
    private static final String KEY_PRODUCTID = "productId";
    private static final String KEY_TITLE = "title";
    private static final Object LOCK = new Object();
    private static final int SCREEN_HEIFHT_THREE = 3;
    private static final String TAG = "DeviceBindWaitingUniversalFragment";
    private AnimationDrawable mAnimHonor;
    private View mBindFailView;
    private View mBindingLayout;
    private View mBottomGuideArrowLayout;
    private HealthButton mDoneButton;
    private BindUniversalCallback mHandlerUniversalCallback;
    private HealthDevice mItem;
    private ArrayList<HealthDevice> mListItems;
    private ImageView mPairGuideProgressAnim;
    private HealthTextView mPairProcessNote;
    private ImageView mPairResultDeviceImg;
    private FrameLayout mPairResultDeviceProgressImgFrameLayout;
    private ImageView mPairResultDeviceShowImg;
    private HealthTextView mPairResultPrivacyTxt;
    private HealthTextView mPairResultTxt;
    private int mPosition;
    private String mProductId;
    private elh mProductInfo;
    private String mTitle;
    private String mUniqueId;
    private ViewTreeObserver mViewTreeObserver;
    private BleDeviceHelper bleDeviceHelper = null;
    private int mBindStatus = 1;
    private Runnable mRun = new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingUniversalFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (drw.e().d(DeviceBindWaitingUniversalFragment.this.mProductInfo.q(), DeviceBindWaitingUniversalFragment.this.mHandlerUniversalCallback)) {
                return;
            }
            DeviceBindWaitingUniversalFragment.this.mHandlerUniversalCallback.onScanFailed(3);
        }
    };
    private Handler mHandler = new Handler() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingUniversalFragment.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j(DeviceBindWaitingUniversalFragment.TAG, "DeviceBindWaitingUniversalFragment handleMessage msg is null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                DeviceBindWaitingUniversalFragment.this.refreshList(message);
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    synchronized (DeviceBindWaitingUniversalFragment.LOCK) {
                        DeviceBindWaitingUniversalFragment.this.bindFail(message.arg1);
                    }
                    return;
                }
                LogUtil.j(DeviceBindWaitingUniversalFragment.TAG, "else msg.what");
            }
        }
    };
    private IDeviceEventHandler mBindingStatusCallback = new IDeviceEventHandler() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingUniversalFragment.3
        @Override // com.huawei.hihealth.device.open.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
        }

        @Override // com.huawei.hihealth.device.open.IDeviceEventHandler
        public void onScanFailed(int i) {
        }

        @Override // com.huawei.hihealth.device.open.IDeviceEventHandler
        public void onStateChanged(int i) {
            LogUtil.a(DeviceBindWaitingUniversalFragment.TAG, "DeviceBindWaitingUniversalFragment pair code: ", Integer.valueOf(i));
            if (DeviceBindWaitingUniversalFragment.this.getActivity() == null) {
                return;
            }
            if (i == 7) {
                LogUtil.a(DeviceBindWaitingUniversalFragment.TAG, "DeviceBindWaitingUniversalFragment PAIRING_PASSED");
                DeviceBindWaitingUniversalFragment.this.pairingPass();
                return;
            }
            if (i != 8) {
                if (i == 10) {
                    drw.e().c(DeviceBindWaitingUniversalFragment.this.mProductId, DeviceBindWaitingUniversalFragment.this.mProductInfo.q(), DeviceBindWaitingUniversalFragment.this.mItem, this);
                    return;
                } else {
                    LogUtil.j(DeviceBindWaitingUniversalFragment.TAG, "DeviceBindWaitingUniversalFragment else");
                    return;
                }
            }
            LogUtil.a(DeviceBindWaitingUniversalFragment.TAG, "DeviceBindWaitingFragment PAIRING_FAILED");
            dmp.d().g(DeviceBindWaitingUniversalFragment.this.mProductId, DeviceBindWaitingUniversalFragment.this.mUniqueId);
            if (dxm.aa(DeviceBindWaitingUniversalFragment.this.mProductId)) {
                DeviceBindWaitingUniversalFragment.this.bindFail(i);
            } else {
                DeviceBindWaitingUniversalFragment.this.bindFailFragment();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bindFailFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        LogUtil.a(TAG, "Fail to bind device.", bundle.toString());
        DeviceBindFailedFragment deviceBindFailedFragment = new DeviceBindFailedFragment();
        dmp.d().g(this.mProductId, this.mUniqueId);
        deviceBindFailedFragment.setArguments(bundle);
        switchFragment(deviceBindFailedFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pairingPass() {
        dyj.d(this.mItem, this.mProductId, this.mProductInfo);
        era.d(this.mProductInfo.m());
        drw.e().b();
        HealthDevice healthDeviceE = dmp.d().e(this.mProductId, this.mUniqueId);
        boolean zEquals = HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(this.mProductInfo.r());
        if (healthDeviceE != null && zEquals) {
            Bundle bundle = new Bundle();
            bundle.putString("view", "bond");
            bundle.putString("productId", this.mProductId);
            bundle.putString("title", this.mTitle);
            ContentValues contentValues = new ContentValues();
            contentValues.put("uniqueId", this.mUniqueId);
            contentValues.put("productId", this.mProductId);
            bundle.putParcelable("commonDeviceInfo", contentValues);
            Fragment deviceSilentGuideFragment = new DeviceSilentGuideFragment();
            deviceSilentGuideFragment.setArguments(bundle);
            switchFragment(deviceSilentGuideFragment);
            return;
        }
        if (healthDeviceE != null && this.mProductInfo.m().equals(com.huawei.health.device.model.HealthDevice.HealthDeviceKind.HDK_HEART_RATE)) {
            if (dxm.aa(this.mProductId)) {
                dmp.d().d(this.mProductId, this.mProductInfo.q(), this.mItem);
                bindSuccess();
                return;
            }
            Fragment heartRateDeviceRunGuide = new HeartRateDeviceRunGuide();
            Bundle bundle2 = new Bundle();
            bundle2.putString("title", this.mTitle);
            heartRateDeviceRunGuide.setArguments(bundle2);
            switchFragment(heartRateDeviceRunGuide);
            return;
        }
        LogUtil.a(TAG, "DeviceBindWaitingUniversalFragment startActivity");
        if (dxm.aa(this.mProductId)) {
            dmn.c().e(this.mProductId, this.mProductInfo.q(), this.mItem);
            bindSuccess();
        } else {
            LogUtil.j(TAG, " else startActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshList(Message message) {
        synchronized (LOCK) {
            if (message.obj instanceof HealthDevice) {
                HealthDevice healthDevice = (HealthDevice) message.obj;
                if (!isDeviceExistInmListItems(healthDevice)) {
                    this.mListItems.add(healthDevice);
                    prepareBind();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        MeasurableDevice measurableDeviceB;
        LogUtil.a(TAG, "DeviceBindWaitingFragment onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j(TAG, "onCreate Bundle is null");
            return;
        }
        if (getActivity() instanceof DeviceMainActivity) {
            this.mListItems = ((DeviceMainActivity) getActivity()).b();
        }
        this.mProductId = arguments.getString("productId");
        ContentValues contentValues = (ContentValues) arguments.getParcelable("commonDeviceInfo");
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = contentValues.getAsString("uniqueId");
        }
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.j(TAG, "onCreate mProductId is null");
            return;
        }
        if (TextUtils.isEmpty(this.mUniqueId) && (measurableDeviceB = dmp.d().b(this.mProductId)) != null) {
            this.mUniqueId = measurableDeviceB.getUniqueId();
        }
        this.mPosition = arguments.getInt("position");
        String string = arguments.getString("title");
        this.mTitle = string;
        if (TextUtils.isEmpty(string)) {
            LogUtil.j(TAG, "onCreate mTitle is null");
            this.mTitle = "";
        }
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        this.mHandlerUniversalCallback = new BindUniversalCallback();
        LogUtil.a(TAG, "DeviceBindWaitingFragment productId is ", this.mProductId);
        LogUtil.d(TAG, "DeviceBindWaitingFragment position is ", Integer.valueOf(this.mPosition));
        ArrayList<HealthDevice> arrayList = this.mListItems;
        if (arrayList != null) {
            LogUtil.a(TAG, "DeviceBindWaitingFragment mListItems size is ", Integer.valueOf(arrayList.size()));
            if (!this.mListItems.isEmpty() || dxm.aa(this.mProductId)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if ((this.mListItems == null || z) && getActivity() != null) {
            LogUtil.a(TAG, "DeviceBindWaitingFragment destroy activity");
            getActivity().finish();
        }
    }

    private void prepareBind() {
        synchronized (LOCK) {
            int i = this.mPosition;
            if (i >= 0 && i < this.mListItems.size()) {
                HealthDevice healthDevice = this.mListItems.get(this.mPosition);
                this.mItem = healthDevice;
                if (healthDevice == null) {
                    LogUtil.j(TAG, "prepareBind mItem is null");
                    return;
                }
                if (this.mProductInfo == null) {
                    getActivity().finish();
                    return;
                }
                this.mUniqueId = healthDevice.getUniqueId();
                LogUtil.d(TAG, "prepareBind item_name: ", this.mItem.getDeviceName());
                LogUtil.a(TAG, "DeviceBindWaitingFragment pair is ", this.mProductInfo.v().a());
                if ("yes".equals(this.mProductInfo.v().a())) {
                    noAutoStatus();
                } else {
                    drw.e().c(this.mProductId, this.mProductInfo.q(), this.mItem, this.mBindingStatusCallback);
                }
            }
        }
    }

    private void noAutoStatus() {
        if (enq.d().c()) {
            return;
        }
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.mItem.getAddress());
            if (remoteDevice.getBondState() != 12) {
                LogUtil.a(TAG, "NOT BOND_BONDED");
                createBond(remoteDevice.getClass(), remoteDevice);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                this.bleDeviceHelper = new BleDeviceHelper(remoteDevice);
                dxw.d().registerReceiver(this.bleDeviceHelper, intentFilter);
                return;
            }
            drw.e().c(this.mProductId, this.mProductInfo.q(), this.mItem, this.mBindingStatusCallback);
        } catch (SecurityException e) {
            LogUtil.e(TAG, "noAutoStatus SecurityException:", ExceptionUtils.c(e));
        }
    }

    public boolean createBond(Class cls, BluetoothDevice bluetoothDevice) {
        try {
            Method method = cls.getMethod("createBond", new Class[0]);
            if (method.invoke(bluetoothDevice, new Object[0]) instanceof Boolean) {
                return ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue();
            }
        } catch (IllegalAccessException e) {
            LogUtil.e(TAG, "IllegalAccessException ", e.getMessage());
        } catch (NoSuchMethodException e2) {
            LogUtil.e(TAG, "NoSuchMethodException ", e2.getMessage());
        } catch (InvocationTargetException e3) {
            LogUtil.e(TAG, "InvocationTargetException ", e3.getMessage());
        }
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "DeviceBindWaitingFragment onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.device_measure_bind_device, viewGroup, false);
        initChildView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.pair_guide_right_btn_layout);
        View viewFindViewById2 = viewInflate.findViewById(R.id.pair_guide_left_cancel_layout);
        viewFindViewById.setOnClickListener(this);
        viewFindViewById2.setOnClickListener(this);
        this.mDoneButton.setOnClickListener(this);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.device_measure_search_prompt);
        if (dxm.aa(this.mProductId)) {
            initStartView();
        } else {
            this.mBindFailView.setVisibility(8);
            this.mBindingLayout.setVisibility(0);
            healthTextView.setText(R.string.IDS_device_selection_waiting_for_binding);
            ((HealthProgressBar) viewInflate.findViewById(R.id.hw_device_bind_pb)).setLayerType(1, null);
        }
        healthTextView.setVisibility(0);
        if (dxm.aa(this.mProductId)) {
            this.mHandler.postDelayed(this.mRun, ProfileExtendConstants.TIME_OUT);
        } else {
            prepareBind();
        }
        ((HealthTextView) viewInflate.findViewById(R.id.right_arrow_txt)).setText(viewInflate.getResources().getString(R.string.IDS_retry).toUpperCase(Locale.ENGLISH));
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.pair_guide_left_image);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.pair_guide_right_image);
        if (LanguageUtil.ba(getActivity())) {
            imageView.setImageResource(R.drawable.ic_arrows_right_black);
            imageView2.setImageResource(R.drawable.ic_arrows_left_black);
        } else {
            imageView.setImageResource(R.drawable.ic_arrows_left_black);
            imageView2.setImageResource(R.drawable.ic_arrows_right_black);
        }
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
        }
        super.setTitle(this.mTitle);
        return viewGroup2;
    }

    private void initChildView(View view) {
        this.mBindFailView = view.findViewById(R.id.hw_device_failed_fragment);
        this.mBindingLayout = view.findViewById(R.id.hw_binding_layout);
        this.mPairResultTxt = (HealthTextView) qsp.a(view, R.id.pair_result_device_show_txt);
        this.mPairResultDeviceShowImg = (ImageView) qsp.a(view, R.id.pair_result_device_show_img);
        this.mPairProcessNote = (HealthTextView) qsp.a(view, R.id.device_pairing_progress_guide_single_note);
        ImageView imageView = (ImageView) qsp.a(view, R.id.device_pair_guide_progress_anim);
        this.mPairGuideProgressAnim = imageView;
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            this.mAnimHonor = (AnimationDrawable) this.mPairGuideProgressAnim.getDrawable();
        }
        this.mBottomGuideArrowLayout = qsp.a(view, R.id.device_pairing_guide_bottom_arrow_layout);
        this.mPairResultPrivacyTxt = (HealthTextView) qsp.a(view, R.id.pair_result_device_privacy_txt);
        if (qsp.a(view, R.id.done_button) instanceof HealthButton) {
            this.mDoneButton = (HealthButton) qsp.a(view, R.id.done_button);
        }
        this.mPairResultDeviceImg = (ImageView) qsp.a(view, R.id.pair_result_device_img);
        this.mPairResultDeviceProgressImgFrameLayout = (FrameLayout) qsp.a(view, R.id.pair_result_device_progress_img);
        ViewTreeObserver viewTreeObserver = this.mPairResultDeviceImg.getViewTreeObserver();
        this.mViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.device.ui.measure.fragment.device.DeviceBindWaitingUniversalFragment.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ViewGroup.LayoutParams layoutParams = DeviceBindWaitingUniversalFragment.this.mPairResultDeviceProgressImgFrameLayout.getLayoutParams();
                layoutParams.height = qrs.m() / 3;
                layoutParams.width = qrs.q();
                DeviceBindWaitingUniversalFragment.this.mPairResultDeviceProgressImgFrameLayout.setLayoutParams(layoutParams);
            }
        });
    }

    private void initStartView() {
        this.mBindStatus = 1;
        this.mPairResultTxt.setText(R.string.IDS_device_selection_waiting_binding);
        this.mPairGuideProgressAnim.setVisibility(0);
        this.mBindFailView.setVisibility(0);
        this.mBindingLayout.setVisibility(8);
        this.mPairResultDeviceShowImg.setVisibility(8);
        this.mPairProcessNote.setVisibility(8);
        this.mAnimHonor.start();
        this.mBottomGuideArrowLayout.setVisibility(8);
        this.mPairResultPrivacyTxt.setVisibility(8);
        this.mDoneButton.setVisibility(8);
    }

    private void bindSuccess() {
        etn.c();
        drw.e().f();
        this.mBindStatus = 2;
        this.mPairGuideProgressAnim.setVisibility(8);
        this.mPairResultTxt.setText(R.string.IDS_device_jabra_bind_success_text);
        this.mBindFailView.setVisibility(0);
        this.mBindingLayout.setVisibility(8);
        this.mPairResultDeviceShowImg.setVisibility(0);
        this.mPairResultDeviceShowImg.setImageResource(R.mipmap.ic_pairing_completed);
        this.mPairProcessNote.setVisibility(8);
        this.mBottomGuideArrowLayout.setVisibility(8);
        this.mPairResultPrivacyTxt.setVisibility(0);
        this.mDoneButton.setVisibility(0);
        this.mDoneButton.setText(getActivity().getResources().getString(R.string.IDS_sns_compelete).toUpperCase(Locale.ENGLISH));
        AnimationDrawable animationDrawable = this.mAnimHonor;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        EventBus.a(new EventBus.d("sub_am16_bind_success"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindFail(int i) {
        drw.e().f();
        this.mBindStatus = 3;
        this.mPairGuideProgressAnim.setVisibility(8);
        this.mPairResultTxt.setText(R.string.IDS_device_binding_fail);
        this.mPairResultDeviceShowImg.setImageResource(R.mipmap.ic_pairing_result_failure);
        this.mBindFailView.setVisibility(0);
        this.mBindingLayout.setVisibility(8);
        this.mPairResultDeviceShowImg.setVisibility(0);
        this.mPairResultDeviceShowImg.setImageResource(R.mipmap.ic_pairing_result_failure);
        this.mPairProcessNote.setVisibility(0);
        if (i == 3) {
            this.mPairProcessNote.setText(R.string.IDS_device_am16_bind_fail_tip);
        } else {
            this.mPairProcessNote.setText(R.string.IDS_device_am16_bind_fail_tip2);
        }
        this.mBottomGuideArrowLayout.setVisibility(0);
        this.mPairResultPrivacyTxt.setVisibility(8);
        this.mDoneButton.setVisibility(8);
        AnimationDrawable animationDrawable = this.mAnimHonor;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        elh elhVar = this.mProductInfo;
        if (elhVar != null && elhVar.v().c() == 2) {
            drw.e().b();
        }
        if (this.bleDeviceHelper != null) {
            dxw.d().unregisterReceiver(this.bleDeviceHelper);
        }
        AnimationDrawable animationDrawable = this.mAnimHonor;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        super.onDestroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.pair_guide_right_btn_layout) {
            synchronized (LOCK) {
                this.mListItems.clear();
                initStartView();
                this.mHandler.postDelayed(this.mRun, ProfileExtendConstants.TIME_OUT);
            }
            return;
        }
        if (id == R.id.pair_guide_left_cancel_layout) {
            if (dmp.d().e(this.mProductId, this.mUniqueId) != null) {
                dmp.d().g(this.mProductId, this.mUniqueId);
            }
            getActivity().finish();
        } else if (id == R.id.done_button) {
            toHonourDeviceFragment();
        } else {
            LogUtil.j(TAG, "onClick else");
        }
    }

    private void toHonourDeviceFragment() {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("goto", "devicebind");
        bundle.putString("title", this.mTitle);
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.mProductId);
        contentValues.put("uniqueId", this.mUniqueId);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        Fragment honourDeviceFragment = new HonourDeviceFragment();
        honourDeviceFragment.setArguments(bundle);
        switchFragment(honourDeviceFragment);
    }

    class BindUniversalCallback implements IDeviceEventHandler {
        @Override // com.huawei.hihealth.device.open.IDeviceEventHandler
        public void onStateChanged(int i) {
        }

        private BindUniversalCallback() {
        }

        @Override // com.huawei.hihealth.device.open.IDeviceEventHandler
        public void onDeviceFound(HealthDevice healthDevice) {
            LogUtil.a(DeviceBindWaitingUniversalFragment.TAG, "Callback, onDeviceFound: ", healthDevice.getDeviceName());
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.obj = healthDevice;
            DeviceBindWaitingUniversalFragment.this.mHandler.sendMessage(messageObtain);
        }

        @Override // com.huawei.hihealth.device.open.IDeviceEventHandler
        public void onScanFailed(int i) {
            LogUtil.a(DeviceBindWaitingUniversalFragment.TAG, "DeviceScanningFragment onScanFailed");
            if (i == 1 || i == 3) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                DeviceBindWaitingUniversalFragment.this.mHandler.sendMessage(messageObtain);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 2;
            messageObtain2.arg1 = i;
            DeviceBindWaitingUniversalFragment.this.mHandler.sendMessage(messageObtain2);
        }
    }

    private boolean isDeviceExistInmListItems(HealthDevice healthDevice) {
        synchronized (LOCK) {
            for (HealthDevice healthDevice2 : this.mListItems) {
                if (healthDevice2.getDeviceName().equals(healthDevice.getDeviceName()) || healthDevice2.getAddress().equals(healthDevice.getAddress())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        int i = this.mBindStatus;
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            toHonourDeviceFragment();
            return false;
        }
        if (i == 3) {
            if (dmp.d().e(this.mProductId, this.mUniqueId) != null) {
                dmp.d().g(this.mProductId, this.mUniqueId);
            }
        } else {
            LogUtil.j(TAG, "onBackPressed else");
        }
        return super.onBackPressed();
    }
}
