package com.xiaomi.hm.health.device.bind;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMShoesDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.device.bind.HMBindShoesLogic;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMBindShoesLogic extends HMBindBaseLogic {
    private BleScanOption l;
    private String m;
    private AdvData n;
    private String o;
    private Lazy<DeviceSnService> p;

    public interface IBindShoesListener extends HMBindBaseLogic.IBindListener {
    }

    public HMBindShoesLogic(Context context) {
        super(context, HMDeviceType.SHOES);
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = KoinJavaComponent.inject(DeviceSnService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N(String str) {
        return "startBindShoes, address: " + str;
    }

    private void O() {
        this.p.getValue().updateSn(HMDeviceType.SHOES, this.o);
    }

    public HMBaseDevice createBleDevice(BluetoothDevice bluetoothDevice) {
        HMShoesDevice hMShoesDevice = new HMShoesDevice(this.mContext, bluetoothDevice);
        hMShoesDevice.setAuthInfo(new AuthInfo(true));
        hMShoesDevice.setAutoReconnect(false);
        hMShoesDevice.setConnectionCallback(this);
        hMShoesDevice.create(true);
        this.mBleDevice = hMShoesDevice;
        return hMShoesDevice;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public String getSN() {
        return this.o;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void onDeviceConnected(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        super.onDeviceConnected(bluetoothDevice, hMDeviceType, status);
        O();
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(BleScanOption bleScanOption) {
        handleBindFailed(HMBindBaseLogic.BindError.SCAN_ERROR);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(BleScanOption bleScanOption) {
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(BleScanOption bleScanOption) {
        if (this.mHasStop.get()) {
            return;
        }
        AdvData advData = this.n;
        if (advData == null) {
            handleBindFailed(HMBindBaseLogic.BindError.NO_DEVICE);
        } else {
            createBleDevice(advData.device);
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(AdvData advData, BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanedDevice:" + advData.device, new Object[0]);
        String address = advData.device.getAddress();
        if (exist(address)) {
            HMLog.i(HMBindBaseLogic.TAG, "return as bound : " + address, new Object[0]);
            return;
        }
        if (address.equals(this.m)) {
            this.n = advData;
            BleScanCenter.getInstance().stopScan(this.l);
        }
    }

    public void setSN(String str) {
        this.o = str;
    }

    public void startBind(final String str, IBindShoesListener iBindShoesListener) {
        HMLog.info(HMBindBaseLogic.TAG_BIND, new Function0() { // from class: ro2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindShoesLogic.N(str);
            }
        });
        super.startBind(iBindShoesListener);
        this.m = str;
        this.l = new BleScanOption.Builder().callback(this).scanTimeout(60000).needConnectedDevices(false).filterAddress(str).build();
        BleScanCenter.getInstance().startScan(this.l);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void stopBind() {
        super.stopBind();
        BleScanCenter.getInstance().stopScan(this.l);
        destroyBleDevice();
    }
}
