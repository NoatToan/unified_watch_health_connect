package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BleMessageParser;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class IPCChannelManager extends ChannelManager {
    private static volatile IPCChannelManager sInstance;

    public static class NotifyReceiver extends BroadcastReceiver {
        private ChannelManager channelManager;

        public NotifyReceiver(ChannelManager channelManager) {
            this.channelManager = channelManager;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ChannelManager.BleChannel channel;
            if ("com.xiaomi.smarthome.bluetooth.character_changed".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("key_device_address");
                UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                if (BluetoothConstants.MISERVICE.equals(uuid) && BluetoothConstants.CHARACTER_IPC.equals(uuid2) && (channel = this.channelManager.getChannel(stringExtra)) != null) {
                    channel.onRead(BLECipher.encrypt(BluetoothCache.getPropTokenBytes(stringExtra), byteArrayExtra));
                }
            }
        }
    }

    private IPCChannelManager() {
    }

    public static IPCChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (IPCChannelManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new IPCChannelManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void init() {
        BluetoothUtils.registerReceiver(new NotifyReceiver(this), new IntentFilter("com.xiaomi.smarthome.bluetooth.character_changed"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public boolean useCrc32Verify() {
        return true;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public void writeBatchBleData(String str, List<byte[]> list, final ChannelCallback channelCallback) {
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        ArrayList arrayList = new ArrayList();
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BLECipher.encrypt(propTokenBytes, it.next()));
        }
        BleConnectManager.getInstance().writeBatchNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_IPC, arrayList, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager.3
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
        byte[] bArrEncrypt = BLECipher.encrypt(BluetoothCache.getPropTokenBytes(str), bArr);
        if (!z) {
            BleConnectManager.getInstance().write(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_IPC, bArrEncrypt, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r2) {
                    ChannelCallback channelCallback2 = channelCallback;
                    if (channelCallback2 != null) {
                        channelCallback2.onCallback(i);
                    }
                }
            });
            return;
        }
        BleConnectManager.getInstance().write(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_IPC, bArrEncrypt, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
            }
        });
        if (channelCallback != null) {
            channelCallback.onCallback(0);
        }
    }

    public synchronized void writeBlock(String str, byte[] bArr, final IBleResponse iBleResponse) {
        ChannelManager.BleChannel channel = getChannel(str);
        if (channel != null) {
            channel.send(BleMessageParser.writeBlockMsgWrapper(bArr), 0, new ChannelCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager.4
                @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                public void onCallback(int i) {
                    IBleResponse iBleResponse2 = iBleResponse;
                    if (iBleResponse2 != null) {
                        try {
                            iBleResponse2.onResponse(i, null);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        } else if (iBleResponse != null) {
            try {
                iBleResponse.onResponse(-1, null);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
