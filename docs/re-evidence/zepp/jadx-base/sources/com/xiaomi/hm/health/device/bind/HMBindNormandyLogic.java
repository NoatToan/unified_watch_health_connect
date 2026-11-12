package com.xiaomi.hm.health.device.bind;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMNormandyDevice;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.HMBindNormandyLogic;
import com.xiaomi.hm.health.device.callback.MyAuthCallback;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class HMBindNormandyLogic extends HMBindBaseLogic {
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = -1;
    private static final int v = -2;
    private static final int w = 20000;
    private static final int x = 10000;
    private BleScanOption l;
    private BleScanOption m;
    private AdvData n;
    private int o;
    private final HashMap<String, AdvData> p;
    private int q;
    public IHMAuthCallback r;

    public interface IBindNormandyListener extends HMBindBaseLogic.IBindListener {
        void onBindNormandyKnock();

        void onBindNormandyKnockSuccess();
    }

    public class a extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ BluetoothDevice a;

        public a(BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            super.onCancel(i);
            HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            super.onCompleted();
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            super.onError(th);
            HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            int i;
            HMLog.d(HMBindBaseLogic.TAG, "HMHttpResponseData:" + hMHttpResponseData, new Object[0]);
            if (!webResponse.success()) {
                HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
                return;
            }
            try {
                i = new JSONObject(webResponse.data).getInt("status");
            } catch (Exception unused) {
                i = 0;
            }
            if (i == -2) {
                HMBindNormandyLogic hMBindNormandyLogic = HMBindNormandyLogic.this;
                hMBindNormandyLogic.handleBindFailed(hMBindNormandyLogic.p.size() > 1 ? HMBindBaseLogic.BindError.MORE_DEVICES : HMBindBaseLogic.BindError.HAS_BOUND);
                return;
            }
            if (i == -1) {
                HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.HAS_DEVICE);
                return;
            }
            if (i != 1) {
                HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.NET_ERROR);
                return;
            }
            if (HMBindNormandyLogic.this.mHasStop.get()) {
                return;
            }
            HMNormandyDevice hMNormandyDevice = new HMNormandyDevice(HMBindNormandyLogic.this.mContext, this.a);
            hMNormandyDevice.setConnectionCallback(HMBindNormandyLogic.this);
            hMNormandyDevice.setAutoReconnect(false);
            hMNormandyDevice.setAuthCallback(HMBindNormandyLogic.this.r);
            hMNormandyDevice.setAuthInfo(new AuthInfo(HMBindNormandyLogic.this.randomKey(), true));
            hMNormandyDevice.create(true);
            HMBindNormandyLogic.this.mBleDevice = hMNormandyDevice;
        }
    }

    public class b extends MyAuthCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.device.callback.MyAuthCallback, com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public void onAuthentication(HMAuthState hMAuthState) {
            int state = hMAuthState.getState();
            if (state == 1) {
                HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.AUTH_FAILED);
                return;
            }
            if (state == 2) {
                HMBindNormandyLogic.this.T();
            } else if (state == 3) {
                HMBindNormandyLogic.this.U();
            } else {
                if (state != 4) {
                    return;
                }
                HMBindNormandyLogic.this.handleBindFailed(HMBindBaseLogic.BindError.AUTH_DENY);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMBindBaseLogic.IBindListener iBindListener = HMBindNormandyLogic.this.mListener;
            if (iBindListener != null) {
                ((IBindNormandyListener) iBindListener).onBindNormandyKnock();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMBindBaseLogic.IBindListener iBindListener = HMBindNormandyLogic.this.mListener;
            if (iBindListener != null) {
                ((IBindNormandyListener) iBindListener).onBindNormandyKnockSuccess();
            }
        }
    }

    public HMBindNormandyLogic(Context context) {
        super(context, HMDeviceType.SHOES);
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = 20000;
        this.p = new HashMap<>();
        this.r = new b();
    }

    private void Q() {
        this.l = new BleScanOption.Builder().scanTimeout(this.o).needConnectedDevices(false).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).filterNames(HMNormandyDevice.getSupportDeviceNames()).callback(this).build();
        BleScanCenter.getInstance().startScan(this.l);
    }

    private void R(BluetoothDevice bluetoothDevice) {
        HMDeviceWebAPI.bindDevice(HMWebBindInfo.createQueryInfo(HMDeviceType.SHOES.getValue(), HMDeviceSource.SHOES_MARS.getValue(), bluetoothDevice.getAddress()), new a(bluetoothDevice), false);
    }

    private void S() {
        this.m = new BleScanOption.Builder().scanTimeout(60000 - this.o).needConnectedDevices(false).filterUUID(HMBaseProfile.UUID_SERVICE_MILI_SERVICE).filterNames(HMNormandyDevice.getSupportDeviceNames()).callback(this).build();
        BleScanCenter.getInstance().startScan(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.mHandler.post(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.mHandler.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V() {
        return "startBind Normandy";
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public int getBrandType() {
        return this.q;
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void handleBindSuccess(HMBaseDevice hMBaseDevice, Device device) {
        super.handleBindSuccess(hMBaseDevice, device);
    }

    public void improve() {
        this.o += 10000;
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
        HMLog.i(HMBindBaseLogic.TAG, "onScanStop:<" + bleScanOption + SearchCriteria.GT + this.n, new Object[0]);
        if (this.mHasStop.get()) {
            return;
        }
        if (bleScanOption == this.l) {
            AdvData advData = this.n;
            if (advData == null || advData.rssi < -60) {
                S();
                return;
            }
        } else if (this.n == null) {
            handleBindFailed(HMBindBaseLogic.BindError.NO_DEVICE);
            return;
        }
        HMLog.i(HMBindBaseLogic.TAG, "start bind device:" + this.n, new Object[0]);
        R(this.n.device);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic, com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(AdvData advData, BleScanOption bleScanOption) {
        HMLog.d(HMBindBaseLogic.TAG, "onScanedDevice:<" + advData.rssi + " " + advData.device + " " + advData.getDeviceName() + SearchCriteria.GT, new Object[0]);
        int i = advData.rssi;
        if (i > 0) {
            HMLog.d(HMBindBaseLogic.TAG, "drop as rssi > 0!!!", new Object[0]);
            return;
        }
        if (i != 0 && !advData.isGeneralDiscoverableMode() && !advData.isLimitedDiscoverableMode()) {
            HMLog.d(HMBindBaseLogic.TAG, "drop connected adv data!!!", new Object[0]);
            return;
        }
        String address = advData.device.getAddress();
        if (exist(address)) {
            HMLog.i(HMBindBaseLogic.TAG, "return as bound : " + address, new Object[0]);
            return;
        }
        this.p.put(address, advData);
        AdvData advData2 = this.n;
        if (advData2 == null || advData2.rssi < i) {
            this.n = advData;
        }
        if (i >= -45 && bleScanOption == this.l) {
            BleScanCenter.getInstance().stopScan(this.l);
        }
        if (i < -60 || bleScanOption != this.m) {
            return;
        }
        BleScanCenter.getInstance().stopScan(this.m);
    }

    public void setBrandType(int i) {
        this.q = i;
    }

    public void startBind(IBindNormandyListener iBindNormandyListener) {
        super.startBind((HMBindBaseLogic.IBindListener) iBindNormandyListener);
        HMLog.info(HMBindBaseLogic.TAG_BIND, new Function0() { // from class: qo2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindNormandyLogic.V();
            }
        });
        this.p.clear();
        Q();
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic
    public void stopBind() {
        super.stopBind();
        destroyBleDevice();
        if (this.l != null) {
            BleScanCenter.getInstance().stopScan(this.l);
        }
        if (this.m != null) {
            BleScanCenter.getInstance().stopScan(this.m);
        }
        this.n = null;
        this.mHandler.removeCallbacksAndMessages(null);
        this.p.clear();
    }
}
