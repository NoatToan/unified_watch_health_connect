package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.baseapi.pluginaudiodevice.ResultCallback;
import com.huawei.health.baseapi.pluginaudiodevice.StateCallback;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.callback.NemoDeviceCallback;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.ecologydevice.util.BrUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class elc {
    public void b(final String str, final NemoDeviceCallback nemoDeviceCallback) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            LogUtil.j("NemoDeviceManager", "Discover And Bond, Mac is Wrong.");
            nemoDeviceCallback.bondError(-1);
            return;
        }
        final BrUtils brUtils = new BrUtils();
        if (brUtils.b()) {
            LogUtil.a("NemoDeviceManager", "Bluetooth Opened.");
            e(str, brUtils, nemoDeviceCallback);
        } else {
            brUtils.a(new BrUtils.OnBrOpenListener() { // from class: elc.5
                @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrOpenListener
                public void onStateError() {
                }

                @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrOpenListener
                public void onStateOff() {
                }

                @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrOpenListener
                public void onStateOn() {
                    elc.this.e(str, brUtils, nemoDeviceCallback);
                }
            });
        }
    }

    public void a(Context context, final String str) {
        if (context == null || !BluetoothAdapter.checkBluetoothAddress(str)) {
            LogUtil.j("NemoDeviceManager", "Context is null or mac is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse("huaweischeme://healthapp/audio?action=detail"));
        Bundle bundle = new Bundle();
        bundle.putString("mac", str);
        bundle.putString("productId", "ZAA6");
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        ddp.a().launchActivity(context, intent, new AppBundleLauncher.InstallCallback() { // from class: ele
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context2, Intent intent2) {
                return this.f33118c.a(str, context2, intent2);
            }
        });
        b("", "SMART_HEADPHONES", false);
        ReleaseLogUtil.d("DEVMGR_NemoDeviceManager", "intoNemoPage enter, mac:", CommonUtil.n(str));
        ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).setDevicesUseTime(str);
    }

    /* synthetic */ boolean a(String str, Context context, Intent intent) {
        LogUtil.a("NemoDeviceManager", "Plugin Called.");
        e(context, str);
        return true;
    }

    private void e(final Context context, final String str) {
        ddp.a().initAudioDeviceKitAdapter(context, new StateCallback() { // from class: eld
            @Override // com.huawei.health.baseapi.pluginaudiodevice.StateCallback
            public final void onResult(int i, Object obj) {
                this.e.d(context, str, i, (String) obj);
            }
        });
    }

    /* synthetic */ void d(Context context, String str, int i, String str2) {
        if (i == 1) {
            c(context, str);
        } else if (i == 2) {
            ddp.a().unregisterConnectStatus(context, str);
        }
    }

    /* JADX INFO: renamed from: elc$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes27.dex */
    class AnonymousClass1 implements ResultCallback<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f33104c;

        AnonymousClass1(Context context, String str) {
            this.f33104c = context;
            this.f33103b = str;
        }

        @Override // com.huawei.health.baseapi.pluginaudiodevice.ResultCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            ddp.a().unregisterConnectStatus(this.f33104c, this.f33103b);
            efk efkVar = new efk();
            efkVar.a(this.f33103b, str, "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", "");
            efkVar.e(this.f33103b, str, "4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c");
            enm.c("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", this.f33103b, str);
            ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).bindDevice("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", new HealthDevice() { // from class: elc.1.5
                @Override // com.huawei.health.device.model.HealthDevice
                public String getAddress() {
                    return null;
                }

                @Override // com.huawei.health.device.model.HealthDevice
                public String getDeviceName() {
                    return null;
                }

                @Override // com.huawei.health.device.model.HealthDevice
                public String getUniqueId() {
                    return AnonymousClass1.this.f33103b;
                }
            }, new IDeviceEventHandler() { // from class: elc.1.1
                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onDeviceFound(HealthDevice healthDevice) {
                    LogUtil.d("NemoDeviceManager", "onDeviceFound");
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onScanFailed(int i) {
                    LogUtil.d("NemoDeviceManager", "onScanFailed code:", Integer.valueOf(i));
                }

                @Override // com.huawei.health.device.callback.IDeviceEventHandler
                public void onStateChanged(int i) {
                    LogUtil.a("NemoDeviceManager", "onStateChanged code :", Integer.valueOf(i));
                }
            });
        }

        @Override // com.huawei.health.baseapi.pluginaudiodevice.ResultCallback
        public void onFailure(int i, String str) {
            ddp ddpVarA = ddp.a();
            final Context context = this.f33104c;
            final String str2 = this.f33103b;
            ddpVarA.registerConnectStatus(context, str2, new StateCallback() { // from class: elb
                @Override // com.huawei.health.baseapi.pluginaudiodevice.StateCallback
                public final void onResult(int i2, Object obj) {
                    this.e.a(context, str2, i2, (String) obj);
                }
            });
        }

        /* synthetic */ void a(Context context, String str, int i, String str2) {
            if (i != 1) {
                return;
            }
            elc.this.c(context, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, String str) {
        ddp.a().obtainDeviceSn(context, str, new AnonymousClass1(context, str));
    }

    private void b(String str, String str2, boolean z) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("device_model", str);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, str2);
        map.put("data_type", Boolean.valueOf(z));
        lmf.d().c(BaseApplication.getContext(), "2170023", map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final BrUtils brUtils, final NemoDeviceCallback nemoDeviceCallback) {
        BluetoothDevice bluetoothDeviceB = brUtils.b(str);
        if (bluetoothDeviceB != null) {
            if (nemoDeviceCallback != null) {
                nemoDeviceCallback.bondSuccess(bluetoothDeviceB);
                etg.d("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", str, str);
                return;
            }
            return;
        }
        LogUtil.a("NemoDeviceManager", "Start bind.");
        BluetoothDevice bluetoothDeviceE = brUtils.e(str);
        if (bluetoothDeviceE != null) {
            a(bluetoothDeviceE, brUtils, new NemoDeviceCallback() { // from class: elc.2
                @Override // com.huawei.health.ecologydevice.callback.NemoDeviceCallback
                public void bondSuccess(BluetoothDevice bluetoothDevice) {
                    nemoDeviceCallback.bondSuccess(bluetoothDevice);
                }

                @Override // com.huawei.health.ecologydevice.callback.NemoDeviceCallback
                public void bondError(int i) {
                    LogUtil.a("NemoDeviceManager", "remote bondDevice error");
                    if (i != 1) {
                        elc.this.c(str, brUtils, nemoDeviceCallback);
                    } else {
                        nemoDeviceCallback.bondError(i);
                    }
                }
            });
        } else {
            c(str, brUtils, nemoDeviceCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str, final BrUtils brUtils, final NemoDeviceCallback nemoDeviceCallback) {
        brUtils.a(new BrUtils.OnBrDiscoverListener() { // from class: elc.3
            @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrDiscoverListener
            public boolean onDiscoverResult(BluetoothDevice bluetoothDevice) {
                String address = bluetoothDevice.getAddress();
                LogUtil.a("NemoDeviceManager", "discover mac:", CommonUtil.n(address));
                if (!str.equals(address)) {
                    return false;
                }
                LogUtil.a("NemoDeviceManager", "Device is discovered");
                elc.this.a(bluetoothDevice, brUtils, nemoDeviceCallback);
                return true;
            }

            @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrDiscoverListener
            public void onDiscoverUnResult() {
                LogUtil.a("NemoDeviceManager", "discover device timeout");
                NemoDeviceCallback nemoDeviceCallback2 = nemoDeviceCallback;
                if (nemoDeviceCallback2 != null) {
                    nemoDeviceCallback2.bondError(1);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice, BrUtils brUtils, final NemoDeviceCallback nemoDeviceCallback) {
        brUtils.a();
        LogUtil.a("NemoDeviceManager", "start bondDevice");
        brUtils.e(bluetoothDevice, new BrUtils.OnBrBondListener() { // from class: elc.4
            @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrBondListener
            public void onBondSuccess(BluetoothDevice bluetoothDevice2) {
                LogUtil.a("NemoDeviceManager", "bondDevice success");
                String address = bluetoothDevice2.getAddress();
                etg.d("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c", address, address);
                NemoDeviceCallback nemoDeviceCallback2 = nemoDeviceCallback;
                if (nemoDeviceCallback2 != null) {
                    nemoDeviceCallback2.bondSuccess(bluetoothDevice2);
                }
            }

            @Override // com.huawei.health.ecologydevice.util.BrUtils.OnBrBondListener
            public void onBondError(int i) {
                LogUtil.a("NemoDeviceManager", "bondDevice error:", Integer.valueOf(i));
                NemoDeviceCallback nemoDeviceCallback2 = nemoDeviceCallback;
                if (nemoDeviceCallback2 == null) {
                    return;
                }
                if (i == 12000) {
                    nemoDeviceCallback2.bondError(1);
                } else {
                    nemoDeviceCallback2.bondError(2);
                }
            }
        });
    }
}
