package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipEncrypt;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class SpecChannelManager extends ChannelManager {
    private static final String ACTION_RECEIVE_SPEC_BLE_DATA = "action.miot.receive.specv2.ble.data";
    private static String TAG = "SpecChannelManager";
    protected UUID mCharacter;
    private Map<String, IBleChannelWriter> writerMap = new ConcurrentHashMap();

    public class NotifyReceiver extends BroadcastReceiver {
        private ChannelManager channelManager;

        public NotifyReceiver(ChannelManager channelManager) {
            this.channelManager = channelManager;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.xiaomi.smarthome.bluetooth.character_changed".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("key_device_address");
                UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                Object[] objArr = new Object[2];
                objArr[0] = SpecChannelManager.TAG;
                objArr[1] = uuid2 == null ? "" : uuid2.toString();
                BluetoothLog.formatLog("%s ,ACTION_CHARACTER_CHANGED character %s", objArr);
                if (BluetoothConstants.MISERVICE.equals(uuid) && SpecChannelManager.this.mCharacter.equals(uuid2)) {
                    SpecChannelManager.this.checkChannelReader(stringExtra);
                    ChannelManager.BleChannel channel = this.channelManager.getChannel(stringExtra);
                    if (channel != null) {
                        channel.onRead(byteArrayExtra);
                    }
                }
            }
        }
    }

    public SpecChannelManager(UUID uuid) {
        this.mCharacter = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkChannelReader(String str) {
        if (getWriterByMac(str) == null) {
            BluetoothLog.formatLog("%s,channel reader not ready", TAG);
        } else {
            BluetoothLog.formatLog("%s,channel reader is ready", TAG);
        }
    }

    public void childInit() {
    }

    public void decryptReceiveData(final String str, byte[] bArr) {
        BleSecurityChipEncrypt.decrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecChannelManager.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr2) {
                if (i != 0) {
                    BluetoothLog.formatLog("%s, decryptReceiveData fail,code %d", SpecChannelManager.TAG, Integer.valueOf(i));
                } else {
                    BluetoothLog.formatLog("%s,decryptReceiveData success,value:%s", SpecChannelManager.TAG, ByteUtils.byteToString(bArr2));
                    SpecChannelManager.this.receive(str, bArr2);
                }
            }
        });
    }

    public IBleChannelWriter getWriterByMac(String str) {
        if (TextUtils.isEmpty(str)) {
            BluetoothLog.formatLog("%s,getWriter,but mac is empty,then return", TAG);
            return null;
        }
        String lowerCase = str.toLowerCase();
        IBleChannelWriter iBleChannelWriter = this.writerMap.get(lowerCase);
        if (iBleChannelWriter != null) {
            return iBleChannelWriter;
        }
        IBleChannelWriter iBleChannelWriterRegisterChannelReader = registerChannelReader(str, new IBleChannelReader() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecChannelManager.1
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader
            public void onRead(String str2, byte[] bArr, int i) throws RemoteException {
                if (i == 0) {
                    SpecChannelManager.this.decryptReceiveData(str2, bArr);
                }
            }
        });
        this.writerMap.put(lowerCase, iBleChannelWriterRegisterChannelReader);
        return iBleChannelWriterRegisterChannelReader;
    }

    public void init() {
        BluetoothUtils.registerReceiver(new NotifyReceiver(this), new IntentFilter("com.xiaomi.smarthome.bluetooth.character_changed"));
        childInit();
    }

    public void receive(String str, byte[] bArr) {
        Intent intent = new Intent(ACTION_RECEIVE_SPEC_BLE_DATA);
        intent.putExtra("mac", str);
        intent.putExtra("value", bArr);
        BluetoothUtils.sendBroadcast(intent);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public boolean useCrc32Verify() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public void writeBatchBleData(String str, List<byte[]> list, final ChannelCallback channelCallback) {
        BleConnectManager.getInstance().writeBatchNoRsp(str, BluetoothConstants.MISERVICE, this.mCharacter, list, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecChannelManager.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
                ChannelCallback channelCallback2 = channelCallback;
                if (channelCallback2 != null) {
                    channelCallback2.onCallback(i);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public void writeBle(String str, byte[] bArr, final ChannelCallback channelCallback, boolean z) {
        BleConnectManager.getInstance().writeNoRsp(str, BluetoothConstants.MISERVICE, this.mCharacter, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SpecChannelManager.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
                ChannelCallback channelCallback2 = channelCallback;
                if (channelCallback2 != null) {
                    channelCallback2.onCallback(i);
                }
            }
        });
    }
}
