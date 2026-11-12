package com.xiaomi.hm.health.device.bind;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMAmazfitScaleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMWeightBfsDevice;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.weight.AmazfitScaleProfile;
import com.xiaomi.hm.health.bt.profile.weight.WeightBfsProfile;
import com.xiaomi.hm.health.bt.profile.weight.WeightProfile;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.HMBindWeightLogic;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceWeightValueEvent;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMBindWeightLogic extends HMBindBaseLogic {
    public final Lazy<AccountWebExtApi> accountWebExtApiLazy;
    private BleScanOption l;
    private HashMap<String, AdvData> m;
    private WeightAdvData n;
    private AdvData o;
    private String p;

    public interface IBindWeightListener extends HMBindBaseLogic.IBindListener {
        void onBindWeigthValue(AdvData advData, boolean z);
    }

    public class a implements Runnable {
        public final /* synthetic */ AdvData a;
        public final /* synthetic */ boolean b;

        public a(AdvData advData, boolean z) {
            this.a = advData;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMBindBaseLogic.IBindListener iBindListener = HMBindWeightLogic.this.mListener;
            if (iBindListener != null) {
                ((IBindWeightListener) iBindListener).onBindWeigthValue(this.a, this.b);
            }
        }
    }

    public HMBindWeightLogic(Context context) {
        super(context, HMDeviceType.WEIGHT);
        this.l = null;
        this.m = new HashMap<>();
        this.n = null;
        this.o = null;
        this.p = null;
        this.accountWebExtApiLazy = KoinJavaComponent.inject(AccountWebExtApi.class);
        this.l = new BleScanOption.Builder().callback(this).scanTimeout(60000).needConnectedDevices(false).filterNames(P()).filterUUID(WeightProfile.UUID_SERVICE_WEIGHT_SCALE_SERVICE).filterUUID(WeightBfsProfile.UUID_SERVICE_BODY_COMPOSITION_SERVICE).filterUUID(AmazfitScaleProfile.INSTANCE.getCOMPOSITION_SERVICE()).build();
    }

    private void N(AdvData advData, boolean z) {
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.post(new a(advData, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O() {
        return "startBindWeight";
    }

    private List<String> P() {
        return ConfigHelperKt.getDeviceConfig(HMDeviceSource.WEIGHT_AMAZFIT_SCALE).getBtNames();
    }

    private void Q(int i, HMDeviceSource hMDeviceSource) {
        if (hMDeviceSource == HMDeviceSource.WEIGHT) {
            if (i == 0) {
                UnitManager.getInstance().setWeightUnit(0);
                return;
            } else if (i == 16) {
                UnitManager.getInstance().setWeightUnit(16);
                return;
            } else {
                if (i == 1) {
                    UnitManager.getInstance().setWeightUnit(1);
                    return;
                }
                return;
            }
        }
        if (hMDeviceSource == HMDeviceSource.WEIGHT_BODYFAT || hMDeviceSource == HMDeviceSource.WEIGHT_BFS) {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            if (i != hMPersonInfo.getMiliConfig().getWeightBfsUnit()) {
                hMPersonInfo.getMiliConfig().setWeightBfsUnit(i);
                hMPersonInfo.saveInfo(2);
                this.accountWebExtApiLazy.getValue().updateProfile(false);
            }
        }
    }

    public void bind(BluetoothDevice bluetoothDevice) {
        HMLog.i(HMBindBaseLogic.TAG, "bind weight device:" + GattUtils.getBluetoothDeviceName(bluetoothDevice) + "," + bluetoothDevice.getAddress(), new Object[0]);
        BleScanCenter.getInstance().stopScan(this.l);
        createBleDevice(bluetoothDevice);
    }

    public HMBaseDevice createBleDevice(BluetoothDevice bluetoothDevice) {
        HMBaseDevice hMWeightBfsDevice;
        if (this.o.weightData.isAmazfitScale()) {
            hMWeightBfsDevice = new HMAmazfitScaleDevice(this.mContext, bluetoothDevice);
            hMWeightBfsDevice.setAuthInfo(new AuthInfo(this.mUserInfo));
        } else {
            hMWeightBfsDevice = this.o.isMatchUUID(WeightBfsProfile.UUID_SERVICE_BODY_COMPOSITION_SERVICE) ? new HMWeightBfsDevice(this.mContext, bluetoothDevice) : new HMWeightDevice(this.mContext, bluetoothDevice);
        }
        hMWeightBfsDevice.setAutoReconnect(false);
        hMWeightBfsDevice.setConnectionCallback(this);
        hMWeightBfsDevice.create(true);
        this.mBleDevice = hMWeightBfsDevice;
        return hMWeightBfsDevice;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void handleBindSuccess(HMBaseDevice hMBaseDevice, Device device) {
        super.handleBindSuccess(hMBaseDevice, device);
        this.mBleDevice.setAutoReconnect(false);
        if (this.n == null || device.getActiveStatus().intValue() != 1) {
            return;
        }
        Q(this.n.getType(), HMDeviceSource.fromValue(device.getDevice_source().intValue()));
        this.n.setDeviceId(device.getDevice_id());
        this.n.setSourceValue(device.getDevice_source().intValue());
        EventBus.getDefault().post(new HMDeviceWeightValueEvent(this.n, true));
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanError:" + bleScanOption, new Object[0]);
        handleBindFailed(HMBindBaseLogic.BindError.SCAN_ERROR);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanStart:" + bleScanOption, new Object[0]);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanStop:" + bleScanOption, new Object[0]);
        if (this.n == null) {
            handleBindFailed(HMBindBaseLogic.BindError.NO_DEVICE);
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(AdvData advData, BleScanOption bleScanOption) {
        HMLog.i(HMBindBaseLogic.TAG, "onScanedDevice:" + advData.weightData, new Object[0]);
        String address = advData.device.getAddress();
        if (exist(address)) {
            HMLog.i(HMBindBaseLogic.TAG, "return as bound : " + address, new Object[0]);
            return;
        }
        this.m.put(address, advData);
        WeightAdvData weightAdvData = advData.weightData;
        if (weightAdvData == null || this.mListener == null) {
            return;
        }
        if (weightAdvData.isFinish() && !weightAdvData.isStable() && address.equals(this.p)) {
            advData.weightData.setValue(0.0f);
            N(advData, this.m.size() == 1);
        }
        if (weightAdvData.isFinish()) {
            return;
        }
        if (weightAdvData.isStable() || weightAdvData.isOverload()) {
            this.n = weightAdvData;
            this.o = advData;
            BleScanCenter.getInstance().stopScan(this.l);
        }
        N(advData, this.m.size() == 1);
        this.p = address;
    }

    public void reSearch() {
        this.n = null;
        this.o = null;
        BleScanCenter.getInstance().stopScan(this.l);
        BleScanCenter.getInstance().startScan(this.l);
    }

    public void startBind(IBindWeightListener iBindWeightListener) {
        super.startBind((HMBindBaseLogic.IBindListener) iBindWeightListener);
        HMLog.info(HMBindBaseLogic.TAG_BIND, new Function0() { // from class: so2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindWeightLogic.O();
            }
        });
        this.n = null;
        this.o = null;
        BleScanCenter.getInstance().startScan(this.l);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void stopBind() {
        super.stopBind();
        BleScanCenter.getInstance().stopScan(this.l);
        this.n = null;
        this.o = null;
        destroyBleDevice();
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
