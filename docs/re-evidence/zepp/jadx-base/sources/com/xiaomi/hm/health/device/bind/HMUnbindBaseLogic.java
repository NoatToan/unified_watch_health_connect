package com.xiaomi.hm.health.device.bind;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.hid.HidSdk;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.device.DeviceManager;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.DeviceGpsHelper;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceUnUseUnbindEvent;
import com.xiaomi.hm.health.device.headset.help.HeadsetUnBindHelper;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMUnbindBaseLogic {
    public static final String TAG = "unbind";
    private static final DeviceManagerApi b;
    private static final Lazy<MiuiFnApi> c;
    private static final Lazy<AgpsTimeStore> d;
    public static final Lazy<DeviceManagerApi> deviceManagerApiLazy;
    private static String a = "com.xiaomi.hm.health";
    public static final String ACTION_DEVICE_BIND_APPLICATION = a + ".ACTION_DEVICE_BIND_APPLICATION";
    public static final String ACTION_DEVICE_UNBIND_APPLICATION = a + ".ACTION_DEVICE_UNBIND_APPLICATION";

    public static class a extends AsyncTask<Void, Void, UnbindError> {
        private IUnbindListener a;
        private HMDeviceType b;
        private HMDeviceSource c;
        private Device d;
        private Boolean e = Boolean.FALSE;

        public a(Device device, IUnbindListener iUnbindListener) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = device;
            this.a = iUnbindListener;
            this.b = HMDeviceType.fromValue(device.getDevice_type().intValue());
            this.c = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String c(UnbindError unbindError) {
            Device device = this.d;
            return "unbind, source: " + this.c + ", mac: " + (device != null ? device.getDevice_address() : null) + ", error: " + unbindError;
        }

        private void e(String str) {
            HMLog.d(HMUnbindBaseLogic.TAG, "unbindDevice : " + str, new Object[0]);
            Application context = DeviceXFunctionsKt.getContext();
            HMLog.d(HMUnbindBaseLogic.TAG, "Unbind Device 1, Disconnect...", new Object[0]);
            BindUtil.disconnectDevice(str, true);
            DeviceManager manager = DeviceManager.getManager(context);
            com.huami.watch.companion.device.Device deviceFind = manager.find(str);
            if (deviceFind != null) {
                HMLog.d(HMUnbindBaseLogic.TAG, "Unbind Device 2, Remove : " + deviceFind, new Object[0]);
                manager.remove(deviceFind);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UnbindError doInBackground(Void... voidArr) {
            HMBaseDevice device;
            String device_id = this.d.getDevice_id();
            String device_address = this.d.getDevice_address();
            int value = this.c.getValue();
            if (HMUnbindBaseLogic.b.isActive(this.d) && ((HMDeviceConfig.hasFeaturePro(this.c) || ConfigHelperKt.hasFeature(Feature.SUPPORT_UNBIND_ACTION, this.c)) && (device = HMUnbindBaseLogic.b.getDevice(this.b)) != null && device.isConnected())) {
                HMLog.i(HMUnbindBaseLogic.TAG, "clear data result: " + device.unbindSync(device.getAuthInfo()), new Object[0]);
            }
            if (HMUnbindBaseLogic.b.isActive(this.d) && this.b == HMDeviceType.EARBUD) {
                HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) HMUnbindBaseLogic.b.getDevice(this.b);
                if (hmEarbudDevice != null) {
                    hmEarbudDevice.cancelDownloadMusic();
                    HMLog.i(HMUnbindBaseLogic.TAG, "earbud reset result: " + hmEarbudDevice.reset(), new Object[0]);
                }
                HMUnbindBaseLogic.b.resetEarbudSetting(true);
            }
            if (HMUnbindBaseLogic.b.isActive(this.d) && value == HMDeviceSource.OTHER_HAYDN.getValue()) {
                HeadsetUnBindHelper.INSTANCE.resetHeadsetSettings();
            }
            HMDeviceType hMDeviceType = this.b;
            boolean zUnbindDevice = hMDeviceType == HMDeviceType.WATCH ? HMDeviceWebAPI.unbindDevice(hMDeviceType, device_id) : HMDeviceWebAPI.bindDeviceToWeb(HMWebBindInfo.createUnbindInfo(hMDeviceType.getValue(), device_id, 0, value, device_address));
            if (zUnbindDevice || !ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, this.c)) {
                return zUnbindDevice ? UnbindError.NONE : UnbindError.NET_ERROR;
            }
            return UnbindError.NONE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(final UnbindError unbindError) {
            super.onPostExecute(unbindError);
            HMLog.info(HMBindBaseLogic.TAG_BIND, new Function0() { // from class: com.xiaomi.hm.health.device.bind.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return this.a.c(unbindError);
                }
            });
            if (unbindError != UnbindError.NONE) {
                this.a.onUnbindFailure(unbindError, this.b);
                return;
            }
            HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(this.d.getDevice_type().intValue());
            HMDeviceType hMDeviceType = HMDeviceType.WATCH;
            if (hMDeviceTypeFromValue == hMDeviceType) {
                e(this.d.getDevice_address());
            }
            Lazy<DeviceManagerApi> lazy = HMUnbindBaseLogic.deviceManagerApiLazy;
            if (lazy.getValue().isActive(this.d)) {
                HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
                if (hMDeviceTypeFromValue == hMDeviceType2) {
                    HMUnbindBaseLogic.unbindThirdRelationForMiLi(DeviceXFunctionsKt.getContext(), "HMUnbindBaseLogic.onPostExecute");
                    ((AgpsTimeStore) HMUnbindBaseLogic.d.getValue()).reset();
                }
                if (hMDeviceTypeFromValue == hMDeviceType2 || hMDeviceTypeFromValue == hMDeviceType) {
                    DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
                }
                lazy.getValue().unbindDevice(hMDeviceTypeFromValue);
                EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceTypeFromValue));
            } else {
                lazy.getValue().unbindDevice(this.d);
                EventBus.getDefault().postSticky(new HMDeviceUnUseUnbindEvent(hMDeviceTypeFromValue));
            }
            this.a.onUnbindSuccess(this.b);
            if (this.e.booleanValue()) {
                HidSdk.unPairDevice(DeviceXFunctionsKt.getContext());
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.e = Boolean.valueOf(ConfigHelperKt.hasFeature(Feature.SUPPORT_TAKE_PIC));
            this.a.onUnbindStart(this.b);
        }
    }

    static {
        Lazy<DeviceManagerApi> lazyInject = KoinJavaComponent.inject(DeviceManagerApi.class);
        deviceManagerApiLazy = lazyInject;
        b = lazyInject.getValue();
        c = KoinJavaComponent.inject(MiuiFnApi.class);
        d = KoinJavaComponent.inject(AgpsTimeStore.class);
    }

    public static void unbind(Device device, IUnbindListener iUnbindListener) {
        new a(device, iUnbindListener).execute(new Void[0]);
    }

    public static void unbindThirdRelationForMiLi(Context context, String str) {
        HMLog.i(TAG, "unbindThirdRelationForMiLi", new Object[0]);
        String boundDeviceAddress = b.getBoundDeviceAddress(HMDeviceType.MILI);
        Lazy<MiuiFnApi> lazy = c;
        lazy.getValue().unbindDevice(boundDeviceAddress, str);
        if (lazy.getValue().hasSetUnlockByDevice(boundDeviceAddress)) {
            Intent intent = new Intent();
            String str2 = ACTION_DEVICE_UNBIND_APPLICATION;
            intent.setAction(str2);
            context.sendBroadcast(intent);
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent2 = new Intent();
                intent2.setAction(str2);
                intent2.setClassName("com.android.settings", "com.android.settings.MiuiBluetoothDeviceActionReceiver");
                context.sendBroadcast(intent2);
            }
        }
    }
}
