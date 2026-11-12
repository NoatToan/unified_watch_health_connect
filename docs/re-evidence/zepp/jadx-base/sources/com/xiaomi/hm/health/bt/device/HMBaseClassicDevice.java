package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.huami.bluetooth.profile.channel.ClassicChannelProfile;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleFactory;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStore;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.HMClassicBluetoothCharacteristic;
import com.xiaomi.hm.health.bt.classic.ClassicConnection;
import com.xiaomi.hm.health.bt.classic.HMSyncLogTask;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.classic.Protocol;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.HMLFProfile;
import com.xiaomi.hm.health.bt.profile.slre.ILFEventListener;
import defpackage.pk2;
import java.io.File;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class HMBaseClassicDevice extends HMBaseDevice implements ClassicConnection.IConnectionCallback, ILFEventListener {
    private ClassicConnection a;
    private DeviceInfo b;
    private HMCallback<HMLFEvent> c;
    private String d;
    private HMLFProfile e;
    private Handler f;
    private HMSyncLogTask g;
    private ClassicChannelProfile h;
    private Status i;
    public Feature mFeature;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what == 3) {
                HMBaseClassicDevice hMBaseClassicDevice = HMBaseClassicDevice.this;
                Status status = Status.CONNECTING_TIMEOUT;
                hMBaseClassicDevice.i = status;
                HMBaseClassicDevice hMBaseClassicDevice2 = HMBaseClassicDevice.this;
                hMBaseClassicDevice2.onConnectionStatusChangedInternal(hMBaseClassicDevice2.getBluetoothDevice(), HMBaseClassicDevice.this.getDeviceType(), status);
            }
        }
    }

    public HMBaseClassicDevice(Context context, BluetoothDevice device) {
        super(context, device);
        this.b = null;
        this.mFeature = null;
        this.c = null;
        this.d = "HMBaseClassicDevice";
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = Status.UNKNOWN;
        this.d += hashCode();
        h();
        ClassicConnection classicConnection = new ClassicConnection(context, device);
        this.a = classicConnection;
        classicConnection.setConnectionCallback(this);
        ClassicChannelProfile classicChannelProfile = new ClassicChannelProfile(device, new pk2(this));
        this.h = classicChannelProfile;
        classicChannelProfile.setSupportChannelFun(new Function0() { // from class: qk2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.a.isSupportChannel());
            }
        });
    }

    private void e() {
        terminateDeviceLog();
    }

    private void f() {
        g().deInit();
    }

    private HMLFProfile g() {
        if (this.e == null) {
            HMLFProfile hMLFProfile = new HMLFProfile(new HMClassicBluetoothCharacteristic(Protocol.SLRE, new pk2(this)), getDeviceType(), null);
            this.e = hMLFProfile;
            hMLFProfile.setListener(this);
        }
        return this.e;
    }

    private void h() {
        HandlerThread handlerThread = new HandlerThread("HMBaseClassicDevice");
        handlerThread.start();
        this.f = new a(handlerThread.getLooper());
    }

    private void i() {
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(3);
        }
    }

    private void j() {
        if (this.f.hasMessages(3)) {
            return;
        }
        Message message = new Message();
        message.what = 3;
        this.f.sendMessageDelayed(message, 120000L);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    public void connect() {
        this.a.connectAsync();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
        super.create(forceDirectly);
        this.a.create();
    }

    public BluetoothCharacteristic createBluetoothCharacteristic(Protocol protocol) {
        return new HMClassicBluetoothCharacteristic(protocol, new pk2(this));
    }

    public boolean d(AuthInfo info, IHMAuthCallback callback) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
        super.destroy();
        ClassicChannelProfile classicChannelProfile = this.h;
        if (classicChannelProfile != null) {
            classicChannelProfile.deInitChannel();
        }
        this.a.destroy();
    }

    public void disconnect() {
        this.a.disconnectAsync();
    }

    public Feature fetchFeature() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    @org.jetbrains.annotations.Nullable
    public ChannelModuleFactory getChannelModuleFactory() {
        ClassicChannelProfile classicChannelProfile = this.h;
        if (classicChannelProfile != null) {
            return classicChannelProfile.getChannelModuleFactory();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    @org.jetbrains.annotations.Nullable
    public ChannelModuleStore getChannelModuleStore() {
        ClassicChannelProfile classicChannelProfile = this.h;
        if (classicChannelProfile != null) {
            return classicChannelProfile.getChannelModuleStore();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public DeviceInfo getDeviceInfo() {
        return this.b;
    }

    public DeviceInfo getDeviceInfoSync() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDeviceLog(File file, IHMDataCallback<File> callback) {
        if (!isConnected()) {
            callback.onStart();
            callback.onStop(file, new HMDeviceError(3));
        } else {
            HMSyncLogTask hMSyncLogTask = new HMSyncLogTask(getTransport(), file, callback);
            this.g = hMSyncLogTask;
            runOnDeviceOnlyThread(hMSyncLogTask);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public Status getStatus() {
        return this.i;
    }

    public ITransport getTransport() {
        return this.a;
    }

    public boolean initAuth() {
        boolean userInfoSync = setUserInfoSync(getAuthInfo().getUserInfo());
        Debug.fi(this.d, "setUserInfoSync ret:" + userInfoSync);
        return userInfoSync & d(getAuthInfo(), this);
    }

    public boolean initChannel() {
        return this.h.initChannel();
    }

    public boolean initDateTime() {
        return setDateTimeSync(Calendar.getInstance());
    }

    public void initLowRateEventListener() {
        g().init();
    }

    public boolean initWhenDeviceConnected() {
        boolean zInitDateTime = initDateTime();
        Debug.fi(this.d, "initDateTime ret:" + zInitDateTime);
        subclassOwnOperation();
        boolean zInitAuth = zInitDateTime & initAuth();
        Debug.fi(this.d, "initAuth ret:" + zInitAuth);
        DeviceInfo deviceInfoSync = getDeviceInfoSync();
        this.b = deviceInfoSync;
        boolean z = zInitAuth & (deviceInfoSync != null);
        Debug.fi(this.d, "device info:" + this.b);
        return z;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isConnected() {
        ClassicConnection classicConnection = this.a;
        return classicConnection != null && classicConnection.isConnected();
    }

    public boolean isSupportChannel() {
        Feature feature = this.mFeature;
        return feature != null && feature.hasHeadset(6);
    }

    @Override // com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
    public void onLFEvent(HMLFEvent event) {
        Debug.fi(this.d, "HMLFEvent:" + event);
        HMCallback<HMLFEvent> hMCallback = this.c;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(event);
        }
    }

    @Override // com.xiaomi.hm.health.bt.classic.ClassicConnection.IConnectionCallback
    public void onStateChanged(int state) {
        Status status = Status.UNKNOWN;
        Debug.fi(this.d, "onStateChanged: " + state);
        if (state == 0) {
            j();
            status = Status.GATT_CONNECTING;
        } else if (state == 1) {
            j();
            boolean zInitWhenDeviceConnected = initWhenDeviceConnected();
            if (zInitWhenDeviceConnected) {
                i();
            }
            status = zInitWhenDeviceConnected ? Status.AUTH_SUCCESS : Status.AUTH_FAILED;
            if (!zInitWhenDeviceConnected && !hasDestroy() && isAutoReconnect() && this.a.isConnected()) {
                this.a.invalidate();
            }
        } else if (state == 2) {
            clearModule();
            e();
            status = Status.DISCONNECTED;
        }
        this.i = status;
        onConnectionStatusChangedInternal(getBluetoothDevice(), getDeviceType(), status);
        if (status == Status.AUTH_SUCCESS) {
            initLowRateEventListener();
        } else {
            f();
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void reConnect(boolean force) {
        this.a.invalidate();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAutoReconnect(boolean autoReconnect) {
        this.a.setAutoReConnect(autoReconnect);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(Calendar calendar) {
        return false;
    }

    public void setLFCallback(HMCallback<HMLFEvent> mLfCallback) {
        this.c = mLfCallback;
    }

    public boolean setUserInfoSync(UserInfo userInfo) {
        return false;
    }

    public void subclassOwnOperation() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public <T extends BaseModule> boolean supportModule(@NotNull Class<T> clazz) {
        ClassicChannelProfile classicChannelProfile = this.h;
        return classicChannelProfile != null && classicChannelProfile.supportModule(clazz);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void terminateDeviceLog() {
        HMSyncLogTask hMSyncLogTask = this.g;
        if (hMSyncLogTask != null) {
            hMSyncLogTask.forceStop();
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public boolean supportModule(int moduleId) {
        ClassicChannelProfile classicChannelProfile = this.h;
        return classicChannelProfile != null && classicChannelProfile.supportModule(moduleId);
    }
}
