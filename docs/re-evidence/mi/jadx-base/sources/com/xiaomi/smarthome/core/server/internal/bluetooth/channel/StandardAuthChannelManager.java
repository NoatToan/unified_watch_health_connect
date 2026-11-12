package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class StandardAuthChannelManager extends ChannelManager {
    private static volatile StandardAuthChannelManager sInstance;

    private StandardAuthChannelManager() {
    }

    public static StandardAuthChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (StandardAuthChannelManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new StandardAuthChannelManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void init() {
        BluetoothLog.d("StandardChannelManager init");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public synchronized IBleChannelWriter registerChannelReader(String str, IBleChannelReader iBleChannelReader) {
        return registerChannelReader(str, true, iBleChannelReader, null);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public boolean useCrc32Verify() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public void writeBatchBleData(String str, List<byte[]> list, final ChannelCallback channelCallback) {
        BleConnectManager.getInstance().writeBatchNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_STANDARD_AUTH, list, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.StandardAuthChannelManager.2
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
        BleConnectManager.getInstance().writeNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_STANDARD_AUTH, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.StandardAuthChannelManager.1
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
