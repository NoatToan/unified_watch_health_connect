package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.framework.api.UserConfig;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import defpackage.b4s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityChipOperate {
    private static final String LOCK_UUID_FORMAT = "0000%04x-0065-6C62-2E74-6F696D2E696D";
    private static final int OPERATOR_SEND_TIMEOUT = 12;
    private static UUID UUID_LOCK_SERVICE = makeLockUUID(4096);
    private static UUID UUID_LOCK_OPERATOR_CHARACTER = makeLockUUID(DKFRequestService.s0);
    private static UUID UUID_LOCK_STATE_CHARACTER = makeLockUUID(DKFRequestService.t0);
    private static UUID UUID_LOCK_LOG_CHARACTER = makeLockUUID(DKFRequestService.u0);
    private static byte[] UNLOCK_OPERATOR = {0};
    private static byte[] LOCK_OPERATOR = {1};
    private static byte[] BOLT_OPERATOR = {2};
    private static Map<String, LastOperator> sLastOperatorMap = new ConcurrentHashMap();
    private static BroadcastReceiver sBroadcastReceiver = null;
    private static ScheduledExecutorService sExecutorService = Executors.newScheduledThreadPool(3);

    public static class BluetoothChangeReceiver extends BroadcastReceiver {
        private BluetoothChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.hasExtra("key_device_address")) {
                return;
            }
            String stringExtra = intent.getStringExtra("key_device_address");
            String action = intent.getAction();
            if (TextUtils.equals(action, "com.xiaomi.smarthome.bluetooth.connect_status_changed")) {
                if (intent.getIntExtra("key_connect_status", 0) == 32) {
                    BleSecurityChipOperate.invokeResponseCallback(stringExtra, -1, null);
                }
            } else if (TextUtils.equals(action, "com.xiaomi.smarthome.bluetooth.character_changed")) {
                BleSecurityChipOperate.processCharacterChanged(stringExtra, intent);
            }
        }
    }

    public static class LastOperator {
        BleReadResponse response;
        ScheduledFuture scheduledFuture;

        private LastOperator() {
        }
    }

    public static class OperatorTimeoutRunnable implements Runnable {
        private String mac;

        public OperatorTimeoutRunnable(String str) {
            this.mac = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LastOperator lastOperator = (LastOperator) BleSecurityChipOperate.sLastOperatorMap.get(this.mac);
            if (lastOperator == null) {
                return;
            }
            lastOperator.scheduledFuture = null;
            BluetoothMyLogger.d("BleSecurityChipOperate timeout, mac = " + BluetoothMyLogger.getBase64(this.mac));
            BleConnectManager.getInstance().disconnect(this.mac);
            BleSecurityChipOperate.invokeResponseCallback(this.mac, -7, null);
        }
    }

    private static void getBleFirmwareVersion(String str, final BleResponse<String> bleResponse) {
        BleConnectManager.getInstance().read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.8
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr) {
                if (i != 0 || ByteUtils.isEmpty(bArr)) {
                    bleResponse.onResponse(-1, "");
                    return;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < bArr.length && bArr[i3] != 0; i3++) {
                    i2++;
                }
                if (i2 == 0) {
                    bleResponse.onResponse(-1, "");
                    return;
                }
                byte[] bArr2 = new byte[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr2[i4] = bArr[i4];
                }
                bleResponse.onResponse(0, new String(bArr2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getEventFromVersion(final String str, final byte[] bArr) {
        getBleFirmwareVersion(str, new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.6
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str2) {
                if (i != 0 || TextUtils.isEmpty(str2)) {
                    BluetoothMyLogger.e("reportLockEvent, get ble firmware version failed");
                    return;
                }
                BluetoothMyLogger.d("reportLockEvent, get ble firmware version = " + str2);
                String propDid = BluetoothCache.getPropDid(str);
                String[] strArrSplit = str2.split("[._]");
                if (strArrSplit.length < 3) {
                    BluetoothMyLogger.e("reportLockEvent, firmware version illegal format");
                    return;
                }
                try {
                    int iIntValue = Integer.valueOf(strArrSplit[0]).intValue();
                    int iIntValue2 = Integer.valueOf(strArrSplit[1]).intValue();
                    int iIntValue3 = Integer.valueOf(strArrSplit[2]).intValue();
                    if (iIntValue < 2) {
                        BleSecurityChipOperate.reportLockEvent(propDid, UserConfig.KEY_DEVICE_LITE_SORT_GROUP, ByteUtils.byteToString(bArr));
                    } else if (iIntValue != 2) {
                        BleSecurityChipOperate.parseLockEvent(propDid, bArr);
                    } else if (iIntValue2 < 1) {
                        BleSecurityChipOperate.reportLockEvent(propDid, UserConfig.KEY_DEVICE_LITE_SORT_GROUP, ByteUtils.byteToString(bArr));
                    } else if (iIntValue2 == 1) {
                        if (iIntValue3 < 7) {
                            BleSecurityChipOperate.reportLockEvent(propDid, UserConfig.KEY_DEVICE_LITE_SORT_GROUP, ByteUtils.byteToString(bArr));
                        } else if (iIntValue3 < 11) {
                            BleSecurityChipOperate.reportLockEvent(propDid, b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, ByteUtils.byteToString(bArr));
                        } else {
                            BleSecurityChipOperate.parseLockEvent(propDid, bArr);
                        }
                    } else if (iIntValue2 != 2) {
                        BleSecurityChipOperate.parseLockEvent(propDid, bArr);
                    } else if (iIntValue3 < 1) {
                        BleSecurityChipOperate.reportLockEvent(propDid, UserConfig.KEY_DEVICE_LITE_SORT_GROUP, ByteUtils.byteToString(bArr));
                    } else if (iIntValue3 < 5) {
                        BleSecurityChipOperate.reportLockEvent(propDid, b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, ByteUtils.byteToString(bArr));
                    } else {
                        BleSecurityChipOperate.parseLockEvent(propDid, bArr);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void init() {
        if (sBroadcastReceiver == null) {
            sBroadcastReceiver = new BluetoothChangeReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.character_changed");
            BluetoothUtils.registerReceiver(sBroadcastReceiver, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void invokeResponseCallback(String str, int i, byte[] bArr) {
        LastOperator lastOperator = sLastOperatorMap.get(str);
        if (lastOperator == null) {
            return;
        }
        ScheduledFuture scheduledFuture = lastOperator.scheduledFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            lastOperator.scheduledFuture = null;
        }
        BleReadResponse bleReadResponse = lastOperator.response;
        if (bleReadResponse != null) {
            bleReadResponse.onResponse(i, bArr);
            lastOperator.response = null;
        }
        sLastOperatorMap.remove(str);
    }

    private static UUID makeLockUUID(int i) {
        return UUID.fromString(String.format(LOCK_UUID_FORMAT, Integer.valueOf(i)));
    }

    public static synchronized void operate(String str, int i, BleReadResponse bleReadResponse) {
        try {
            init();
            if (i == 0) {
                sendOperator(str, UNLOCK_OPERATOR, bleReadResponse);
            } else if (i == 1) {
                sendOperator(str, LOCK_OPERATOR, bleReadResponse);
            } else if (i == 2) {
                sendOperator(str, BOLT_OPERATOR, bleReadResponse);
            } else if (bleReadResponse != null) {
                BluetoothMyLogger.v(String.format("operator(%d) is invalid", Integer.valueOf(i)));
                bleReadResponse.onResponse(-1, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parseLockEvent(String str, byte[] bArr) {
        if (bArr.length <= 2) {
            BluetoothMyLogger.e("parseLockEvent data is wrong");
            return;
        }
        byte[] bArr2 = new byte[2];
        int length = bArr.length - 2;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(bArr, 2, bArr3, 0, length);
        reportLockEvent(str, String.valueOf((int) ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getShort()), ByteUtils.byteToString(bArr3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processCharacterChanged(final String str, Intent intent) {
        UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
        UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
        if (UUID_LOCK_SERVICE.equals(uuid)) {
            if (UUID_LOCK_STATE_CHARACTER.equals(uuid2)) {
                BleSecurityChipEncrypt.decrypt(str, byteArrayExtra, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.4
                    @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                    public void onResponse(int i, byte[] bArr) {
                        BluetoothMyLogger.d(String.format("decrypt lock state: code = %d, data = %s", Integer.valueOf(i), ByteUtils.byteToString(bArr)));
                        if (i == 0) {
                            BleSecurityChipOperate.invokeResponseCallback(str, 0, bArr);
                        } else {
                            BluetoothMyLogger.v("operator decrypt failed");
                            BleSecurityChipOperate.invokeResponseCallback(str, -1, null);
                        }
                    }
                });
            } else if (UUID_LOCK_LOG_CHARACTER.equals(uuid2)) {
                BleSecurityChipEncrypt.decrypt(str, byteArrayExtra, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.5
                    @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                    public void onResponse(int i, byte[] bArr) {
                        BluetoothMyLogger.d(String.format("decrypt lock log: code = %d, data = %s", Integer.valueOf(i), ByteUtils.byteToString(bArr)));
                        if (i == 0) {
                            BleSecurityChipOperate.getEventFromVersion(str, bArr);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportLockEvent(String str, String str2, String str3) {
        DeviceApi.reportDeviceEvent(str, "event", str2, str3, new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.7
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str4) {
            }
        });
    }

    private static void sendOperator(final String str, final byte[] bArr, final BleReadResponse bleReadResponse) {
        if (sLastOperatorMap.get(str) == null) {
            BleConnectManager.getInstance().notify(str, UUID_LOCK_SERVICE, UUID_LOCK_LOG_CHARACTER, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.1
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r2) {
                }
            });
            BleConnectManager.getInstance().notify(str, UUID_LOCK_SERVICE, UUID_LOCK_STATE_CHARACTER, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("sendOperator notify code = " + i);
                    if (i == 0) {
                        BleSecurityChipEncrypt.encrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.2.1
                            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                            public void onResponse(int i2, byte[] bArr2) {
                                if (i2 == 0) {
                                    BluetoothMyLogger.v("operator encrypt success  code=" + i2);
                                    LastOperator lastOperator = new LastOperator();
                                    lastOperator.response = bleReadResponse;
                                    BleSecurityChipOperate.sLastOperatorMap.put(str, lastOperator);
                                    lastOperator.scheduledFuture = BleSecurityChipOperate.sExecutorService.schedule(new OperatorTimeoutRunnable(str), 12L, TimeUnit.SECONDS);
                                    BleSecurityChipOperate.writeEncryptOperator(str, bArr2);
                                    return;
                                }
                                BluetoothMyLogger.v("operator encrypt failed  code=" + i2 + "  mac=" + str + "  operator=" + bArr);
                                BleReadResponse bleReadResponse2 = bleReadResponse;
                                if (bleReadResponse2 != null) {
                                    bleReadResponse2.onResponse(-1, null);
                                }
                            }
                        });
                        return;
                    }
                    if (bleReadResponse != null) {
                        BluetoothMyLogger.v("Code.REQUEST_NOTIFY_FAILED code = " + i);
                        bleReadResponse.onResponse(-27, null);
                    }
                }
            });
        } else {
            BluetoothMyLogger.v("有上一次开锁操作正在进行，等待操作完成...");
            if (bleReadResponse != null) {
                bleReadResponse.onResponse(-13, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeEncryptOperator(final String str, byte[] bArr) {
        BleConnectManager.getInstance().write(str, UUID_LOCK_SERVICE, UUID_LOCK_OPERATOR_CHARACTER, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                if (i != 0) {
                    BleSecurityChipOperate.invokeResponseCallback(str, -1, null);
                }
            }
        });
    }
}
