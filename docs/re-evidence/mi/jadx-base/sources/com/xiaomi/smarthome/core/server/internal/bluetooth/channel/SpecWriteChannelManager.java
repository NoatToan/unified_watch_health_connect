package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipEncrypt;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.plugin.update.PluginError;

/* JADX INFO: loaded from: classes10.dex */
public class SpecWriteChannelManager extends SpecChannelManager {
    private static final String ACTION_WRITE_SPEC_BLE_DATA = "action.miot.write.specv2.ble.data";
    private static final String ACTION_WRITE_SPEC_BLE_DATA_RESP = "action.miot.write.specv2.ble.data.resp";
    private static final String TAG = "SpecChannelManager";
    public static long mTimeFlag;
    private Sender mReceiver;

    public static final class Holder {
        public static final SpecWriteChannelManager instance = new SpecWriteChannelManager();
    }

    public class Sender extends BroadcastReceiver {
        public Sender() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (SpecWriteChannelManager.ACTION_WRITE_SPEC_BLE_DATA.equals(intent.getAction())) {
                try {
                    SpecWriteChannelManager.this.encryptSendData(intent.getStringExtra("mac"), intent.getByteArrayExtra("value"));
                } catch (Exception e) {
                    BluetoothMyLogger.e("SpecChannelManager, onReceive exception=" + e.getMessage());
                }
            }
        }
    }

    public static SpecWriteChannelManager getInstance() {
        return Holder.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void send(final String str, byte[] bArr, final byte[] bArr2) {
        try {
            IBleChannelWriter writerByMac = getWriterByMac(str);
            if (writerByMac != null) {
                writerByMac.write(bArr, 0, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecWriteChannelManager.2
                    @Override // android.os.IInterface
                    public IBinder asBinder() {
                        return null;
                    }

                    @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
                    public void onResponse(int i, Bundle bundle) throws RemoteException {
                        Object[] objArr = new Object[3];
                        objArr[0] = SpecWriteChannelManager.TAG;
                        objArr[1] = Integer.valueOf(i);
                        objArr[2] = bundle == null ? null : bundle.toString();
                        BluetoothLog.formatLog("%s, send onResponse,code %d, data=%s", objArr);
                        SpecWriteChannelManager.this.broadcastWriteDataCallback(str, bArr2, i);
                    }
                });
            } else {
                BluetoothMyLogger.i("send 0 ");
                broadcastWriteDataCallback(str, bArr2, PluginError.INSTALL_ERROR_FOR_CREATE_PACKAGE_INFO);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void broadcastWriteDataCallback(String str, byte[] bArr, int i) {
        BluetoothMyLogger.i("broadcastWriteDataCallback " + i + ", " + mTimeFlag);
        Intent intent = new Intent(ACTION_WRITE_SPEC_BLE_DATA_RESP);
        intent.putExtra("mac", str);
        intent.putExtra("value", bArr);
        intent.putExtra("timestamp", mTimeFlag);
        intent.putExtra("code", i);
        BluetoothUtils.sendBroadcast(intent);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecChannelManager
    public void childInit() {
        if (this.mReceiver == null) {
            mTimeFlag = System.currentTimeMillis();
            BluetoothMyLogger.i("spec write time flag:" + mTimeFlag);
            this.mReceiver = new Sender();
            BluetoothUtils.registerReceiver(this.mReceiver, new IntentFilter(ACTION_WRITE_SPEC_BLE_DATA));
        }
    }

    public void encryptSendData(final String str, final byte[] bArr) {
        BleSecurityChipEncrypt.encrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecWriteChannelManager.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr2) {
                if (i == 0) {
                    SpecWriteChannelManager.this.send(str, bArr2, bArr);
                } else {
                    BluetoothLog.formatLog("%s, encryptSendData fail,code %d", SpecWriteChannelManager.TAG, Integer.valueOf(i));
                    SpecWriteChannelManager.this.broadcastWriteDataCallback(str, bArr, i);
                }
            }
        });
    }

    private SpecWriteChannelManager() {
        super(BluetoothConstants.CHARACTER_BLE_SPEC_WRITE);
        this.mReceiver = null;
    }
}
