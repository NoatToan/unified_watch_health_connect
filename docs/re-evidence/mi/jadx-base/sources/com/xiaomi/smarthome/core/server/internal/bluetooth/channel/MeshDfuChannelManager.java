package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MeshDfuChannelManager extends ChannelManager {
    private static volatile MeshDfuChannelManager sInstance;

    private MeshDfuChannelManager() {
    }

    public static MeshDfuChannelManager getInstance() {
        if (sInstance == null) {
            synchronized (MeshDfuChannelManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new MeshDfuChannelManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public boolean useCrc32Verify() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public void writeBatchBleData(String str, List<byte[]> list, final ChannelCallback channelCallback) {
        BleConnectManager.getInstance().writeBatchNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, list, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.MeshDfuChannelManager.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
                BluetoothLog.d("writeBatchBleData onResponse");
                ChannelCallback channelCallback2 = channelCallback;
                if (channelCallback2 != null) {
                    channelCallback2.onCallback(i);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager
    public void writeBle(String str, byte[] bArr, final ChannelCallback channelCallback, boolean z) {
        if (z) {
            BleConnectManager.getInstance().writeNoRspFast(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.MeshDfuChannelManager.1
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r2) {
                    BluetoothLog.d("writeble onResponse");
                    ChannelCallback channelCallback2 = channelCallback;
                    if (channelCallback2 != null) {
                        channelCallback2.onCallback(i);
                    }
                }
            });
        } else {
            BleConnectManager.getInstance().writeNoRsp(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.MeshDfuChannelManager.2
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
}
