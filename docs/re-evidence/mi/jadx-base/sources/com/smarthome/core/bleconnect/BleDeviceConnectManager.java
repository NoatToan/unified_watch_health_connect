package com.smarthome.core.bleconnect;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.smarthome.core.scan.SDKBleDevice;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.SecureConnectOptions;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/smarthome/core/bleconnect/BleDeviceConnectManager;", "", "()V", "TAG", "", "mBleConnectOption", "Lcom/xiaomi/smarthome/library/bluetooth/BleConnectOptions;", "getMBleConnectOption", "()Lcom/xiaomi/smarthome/library/bluetooth/BleConnectOptions;", "setMBleConnectOption", "(Lcom/xiaomi/smarthome/library/bluetooth/BleConnectOptions;)V", "mBleSecurityLauncher", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/security/ISecureConnectHandler;", "bleStandardAuthConnect", "", "mac", "token", "pid", "", "callback", "Lcom/smarthome/core/bleconnect/BleDeviceConnectManager$IBleConnectResponse;", "getBindDeviceDid", "getBindDeviceToken", "startBindBleDevice", "device", "Lcom/smarthome/core/scan/SDKBleDevice;", "stopBindBleStandardDevice", "IBleConnectResponse", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BleDeviceConnectManager {

    @NotNull
    public static final BleDeviceConnectManager INSTANCE = new BleDeviceConnectManager();

    @NotNull
    public static final String TAG = "smartCoreTest";

    @NotNull
    private static BleConnectOptions mBleConnectOption;

    @Nullable
    private static ISecureConnectHandler mBleSecurityLauncher;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/smarthome/core/bleconnect/BleDeviceConnectManager$IBleConnectResponse;", "", "onAuthResponse", "", "code", "", "args", "Landroid/os/Bundle;", "onBindResponse", "onConnectResponse", "onLastResponse", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface IBleConnectResponse {
        void onAuthResponse(int code, @Nullable Bundle args);

        void onBindResponse(int code, @Nullable Bundle args);

        void onConnectResponse(int code, @Nullable Bundle args);

        void onLastResponse(int code, @Nullable Bundle args);
    }

    static {
        BleConnectOptions bleConnectOptionsBuild = new BleConnectOptions.Builder().setConnectRetry(1).setConnectTimeout(31000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(15000).build();
        Intrinsics.checkNotNullExpressionValue(bleConnectOptionsBuild, "Builder()\n        .setCo…t(15000)\n        .build()");
        mBleConnectOption = bleConnectOptionsBuild;
    }

    private BleDeviceConnectManager() {
    }

    public final void bleStandardAuthConnect(@NotNull String mac, @NotNull String token, int pid, @Nullable final IBleConnectResponse callback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(token, "token");
        if (TextUtils.isEmpty(mac) || TextUtils.isEmpty(token) || pid <= 0) {
            if (callback == null) {
                return;
            }
            callback.onLastResponse(-1, null);
        } else {
            BluetoothCache.setPropProductId(mac, pid);
            BluetoothCache.setPropToken(mac, token);
            BleSecureConnectManager.bleStandardAuthConnect(mac, new SecureConnectOptions.Builder().setConnectOptions(mBleConnectOption).build(), new IBleSecureConnectResponse() { // from class: com.smarthome.core.bleconnect.BleDeviceConnectManager.bleStandardAuthConnect.1
                @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                public void onAuthResponse(int code, @Nullable Bundle args) {
                    IBleConnectResponse iBleConnectResponse = callback;
                    if (iBleConnectResponse == null) {
                        return;
                    }
                    iBleConnectResponse.onAuthResponse(code, args);
                }

                @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                public void onBindResponse(int code, @Nullable Bundle args) {
                    IBleConnectResponse iBleConnectResponse = callback;
                    if (iBleConnectResponse == null) {
                        return;
                    }
                    iBleConnectResponse.onBindResponse(code, args);
                }

                @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                public void onConnectResponse(int code, @Nullable Bundle args) {
                    IBleConnectResponse iBleConnectResponse = callback;
                    if (iBleConnectResponse == null) {
                        return;
                    }
                    iBleConnectResponse.onConnectResponse(code, args);
                }

                @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                public void onLastResponse(int code, @Nullable Bundle args) {
                    IBleConnectResponse iBleConnectResponse = callback;
                    if (iBleConnectResponse == null) {
                        return;
                    }
                    iBleConnectResponse.onLastResponse(code, args);
                }
            });
        }
    }

    @NotNull
    public final String getBindDeviceDid(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String propDid = BluetoothCache.getPropDid(mac);
        Intrinsics.checkNotNullExpressionValue(propDid, "getPropDid(mac)");
        return propDid;
    }

    @NotNull
    public final String getBindDeviceToken(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String propToken = BluetoothCache.getPropToken(mac);
        Intrinsics.checkNotNullExpressionValue(propToken, "getPropToken(mac)");
        return propToken;
    }

    @NotNull
    public final BleConnectOptions getMBleConnectOption() {
        return mBleConnectOption;
    }

    public final void setMBleConnectOption(@NotNull BleConnectOptions bleConnectOptions) {
        Intrinsics.checkNotNullParameter(bleConnectOptions, "<set-?>");
        mBleConnectOption = bleConnectOptions;
    }

    public final void startBindBleDevice(@NotNull SDKBleDevice device, @Nullable final IBleConnectResponse callback) {
        MiotBleAdvPacket.FrameControl frameControl;
        Intrinsics.checkNotNullParameter(device, "device");
        if (device.getMPacket() != null) {
            MiotBleAdvPacket mPacket = device.getMPacket();
            if ((mPacket == null ? null : mPacket.frameControl) != null) {
                MiotBleAdvPacket mPacket2 = device.getMPacket();
                if (mPacket2 == null || (frameControl = mPacket2.frameControl) == null || frameControl.authMode != 2) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%s Start secureConnect", Arrays.copyOf(new Object[]{"smartCoreTest"}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    BluetoothMyLogger.v(str);
                    BleSecureConnectManager.secureConnect(device.getMac(), new SecureConnectOptions.Builder().setConnectOptions(mBleConnectOption).build(), new IBleSecureConnectResponse() { // from class: com.smarthome.core.bleconnect.BleDeviceConnectManager.startBindBleDevice.2
                        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                        public void onAuthResponse(int code, @Nullable Bundle args) {
                            try {
                                IBleConnectResponse iBleConnectResponse = callback;
                                if (iBleConnectResponse != null) {
                                    iBleConnectResponse.onAuthResponse(code, args);
                                }
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                Object[] objArr = new Object[2];
                                objArr[0] = Integer.valueOf(code);
                                objArr[1] = args == null ? null : args.toString();
                                String str2 = String.format("BluetoothHelper secureConnect onAuthResponse code %d, bundle %s", Arrays.copyOf(objArr, 2));
                                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                                BluetoothMyLogger.d(str2);
                            } catch (Throwable th) {
                                BluetoothLog.e(th);
                            }
                        }

                        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                        public void onBindResponse(int code, @Nullable Bundle args) {
                            try {
                                IBleConnectResponse iBleConnectResponse = callback;
                                if (iBleConnectResponse != null) {
                                    iBleConnectResponse.onBindResponse(code, args);
                                }
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                Object[] objArr = new Object[2];
                                objArr[0] = Integer.valueOf(code);
                                objArr[1] = args == null ? null : args.toString();
                                String str2 = String.format("BluetoothHelper secureConnect onBindResponse code %d, bundle %s", Arrays.copyOf(objArr, 2));
                                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                                BluetoothMyLogger.d(str2);
                            } catch (Throwable th) {
                                BluetoothLog.e(th);
                            }
                        }

                        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                        public void onConnectResponse(int code, @Nullable Bundle args) {
                            try {
                                IBleConnectResponse iBleConnectResponse = callback;
                                if (iBleConnectResponse != null) {
                                    iBleConnectResponse.onConnectResponse(code, args);
                                }
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                Object[] objArr = new Object[2];
                                objArr[0] = Integer.valueOf(code);
                                objArr[1] = args == null ? null : args.toString();
                                String str2 = String.format("BluetoothHelper secureConnect onConnectResponse code %d, bundle %s", Arrays.copyOf(objArr, 2));
                                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                                BluetoothMyLogger.d(str2);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }

                        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                        public void onLastResponse(int code, @Nullable Bundle args) {
                            try {
                                IBleConnectResponse iBleConnectResponse = callback;
                                if (iBleConnectResponse != null) {
                                    iBleConnectResponse.onLastResponse(code, args);
                                }
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                Object[] objArr = new Object[2];
                                objArr[0] = Integer.valueOf(code);
                                objArr[1] = args == null ? null : args.toString();
                                String str2 = String.format("BluetoothHelper secureConnect onLastResponse code %d, bundle %s", Arrays.copyOf(objArr, 2));
                                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                                BluetoothMyLogger.d(str2);
                            } catch (Throwable th) {
                                BluetoothLog.e(th);
                            }
                        }
                    });
                    return;
                }
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s Start bleStandardAuthBind", Arrays.copyOf(new Object[]{"smartCoreTest"}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                BluetoothMyLogger.v(str2);
                SecureConnectOptions secureConnectOptionsBuild = new SecureConnectOptions.Builder().setConnectOptions(mBleConnectOption).build();
                Object[] objArr = new Object[2];
                objArr[0] = device.getModel();
                objArr[1] = secureConnectOptionsBuild != null ? secureConnectOptionsBuild.toString() : null;
                String str3 = String.format("BluetoothHelper bleStandardAuthBind model = %s, connectionOptions %s", Arrays.copyOf(objArr, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
                BluetoothMyLogger.d(str3);
                mBleSecurityLauncher = BleSecureConnectManager.bleStandardAuthBind(device.getMac(), secureConnectOptionsBuild, new IBleSecureConnectResponse() { // from class: com.smarthome.core.bleconnect.BleDeviceConnectManager.startBindBleDevice.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                    public void onAuthResponse(int code, @Nullable Bundle args) {
                        try {
                            IBleConnectResponse iBleConnectResponse = callback;
                            if (iBleConnectResponse != null) {
                                iBleConnectResponse.onAuthResponse(code, args);
                            }
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = Integer.valueOf(code);
                            objArr2[1] = args == null ? null : args.toString();
                            String str4 = String.format("BluetoothHelper bleStandardAuthBind onAuthResponse code %d, bundle %s", Arrays.copyOf(objArr2, 2));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
                            BluetoothMyLogger.d(str4);
                        } catch (Throwable th) {
                            BluetoothLog.e(th);
                        }
                    }

                    @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                    public void onBindResponse(int code, @Nullable Bundle args) {
                        try {
                            IBleConnectResponse iBleConnectResponse = callback;
                            if (iBleConnectResponse != null) {
                                iBleConnectResponse.onBindResponse(code, args);
                            }
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = Integer.valueOf(code);
                            objArr2[1] = args == null ? null : args.toString();
                            String str4 = String.format("BluetoothHelper bleStandardAuthBind onBindResponse code %d, bundle %s", Arrays.copyOf(objArr2, 2));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
                            BluetoothMyLogger.d(str4);
                        } catch (Throwable th) {
                            BluetoothLog.e(th);
                        }
                    }

                    @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                    public void onConnectResponse(int code, @Nullable Bundle args) {
                        try {
                            IBleConnectResponse iBleConnectResponse = callback;
                            if (iBleConnectResponse != null) {
                                iBleConnectResponse.onConnectResponse(code, args);
                            }
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = Integer.valueOf(code);
                            objArr2[1] = args == null ? null : args.toString();
                            String str4 = String.format("BluetoothHelper bleStandardAuthBind onConnectResponse code %d, bundle %s", Arrays.copyOf(objArr2, 2));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
                            BluetoothMyLogger.d(str4);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }

                    @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
                    public void onLastResponse(int code, @Nullable Bundle args) {
                        try {
                            IBleConnectResponse iBleConnectResponse = callback;
                            if (iBleConnectResponse != null) {
                                iBleConnectResponse.onLastResponse(code, args);
                            }
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = Integer.valueOf(code);
                            objArr2[1] = args == null ? null : args.toString();
                            String str4 = String.format("BluetoothHelper bleStandardAuthBind onLastResponse code %d, bundle %s", Arrays.copyOf(objArr2, 2));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
                            BluetoothMyLogger.d(str4);
                        } catch (Throwable th) {
                            BluetoothLog.e(th);
                        }
                    }
                });
            }
        }
    }

    public final void stopBindBleStandardDevice() throws RemoteException {
        ISecureConnectHandler iSecureConnectHandler = mBleSecurityLauncher;
        if (iSecureConnectHandler == null) {
            return;
        }
        iSecureConnectHandler.cancel();
    }
}
